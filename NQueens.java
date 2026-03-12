import java.util.Scanner;
public class NQueens{
	static int n;
	static int[] x;
	static int count=0;
	static boolean place(int k,int i){
		for(int j=1;j<=k-1;j++){
			if(x[j]==i) return false;
			if(Math.abs(x[j]-i)==Math.abs(j-k)) return false;
		}
		return true;
	}
	static void NQueens(int k){
		for(int i=1;i<=n;i++){
			if(place(k,i)){
				x[k]=i;
				if(k==n){
					printSolution();
					count++;
				}
				else {
					NQueens(k+1);
				}
			}
		}
	}
	static void printSolution(){
		for(int i=1;i<=n;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		x=new int[n+1];  // 1 based indexing
		NQueens(1);
		System.out.println("Total solutions= "+count);
		sc.close();
	}
}
