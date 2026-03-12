import java.util.Arrays;
import java.util.Scanner;
public class SumOfSubsets{
	private int n,m;
	private int[] w,x;
	public SumOfSubsets(int n,int m,int[] weights){
		this.n=n;
		this.m=m;
		this.w=weights;
		this.x=new int[n];
	}
	public void sumOfSub(int s,int k,int r){
		if(s==m){
			printSolution();
			return;
		}
		if(k>=n || s>m || s+r <m) return;
		x[k]=1;
		sumOfSub(s+w[k],k+1,r-w[k]);
		
		x[k]=0;
		sumOfSub(s,k+1,r-w[k]);
	}
	private void printSolution(){
		System.out.println("Solution: ");
		for(int i=0;i<n;i++)
			System.out.print(x[i]+" ");
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		int[] weights=new int[n];
		int sum=0;
		System.out.println("Enter the weights: ");
		for(int i=0;i<n;i++){
			weights[i]=sc.nextInt();
			sum+=weights[i];
		}
		System.out.println("Enter the required sum(m): ");
		int m=sc.nextInt();
		Arrays.sort(weights);
		System.out.println("Sorted weights: "+Arrays.toString(weights));
		SumOfSubsets ans=new SumOfSubsets(n,m,weights);
		System.out.println("Possible solutions: ");
		ans.sumOfSub(0,0,sum);
		sc.close();
	}
}
