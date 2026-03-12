import java.util.Scanner;
public class GraphColouring{
	int n;
	int m;
	int[][] G;
	int[] x;
	void nextValue(int k){
		while(true){
			x[k]=(x[k]+1)%(m+1);
			if(x[k]==0) return;
			int j;
			for(j=1;j<=n;j++){
				if(G[k][j]!=0 && x[k]==x[j]) break;
			}
			if(j==n+1) return;
		}
	}
	void mColouring(int k){
		while(true){
			nextValue(k);
			if(x[k]==0) return;
			if(k==n){
				System.out.println("Solution");
				for(int i=1;i<=n;i++){
					System.out.print(x[i]+" ");
				}
				System.out.println();
			}else mColouring(k+1);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		GraphColouring gc=new GraphColouring();
		System.out.println("Enter number of vertices: ");
		gc.n=sc.nextInt();
		System.out.println("Enter number of colours: ");
		gc.m=sc.nextInt();
		gc.G=new int[gc.n+1][gc.n+1];
		gc.x=new int[gc.n+1];
		System.out.println("Enter Adjacency Matrix: ");
		for(int i=1;i<=gc.n;i++){
			for(int j=1;j<=gc.n;j++){
				gc.G[i][j]=sc.nextInt();
			}
		}
		for(int i=1;i<=gc.n;i++){
			gc.x[i]=0;
		}
		System.out.println("Possible Colourings: ");
		gc.mColouring(1);
	}
}
