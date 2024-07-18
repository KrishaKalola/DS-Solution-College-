import java.util.*;
//using a 2-D array 
public class Graph{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no. of nodes: ");
	int node=sc.nextInt();

	int[][] adj=new int[node][node];

	System.out.println("Enter a number of edges: ");
	int edges=sc.nextInt();
	for(int i=0;i<edges;i++){
		System.out.println("Enter a source: ");
		int source=sc.nextInt();
		System.out.println("Enter a distination:");
		int dist=sc.nextInt();

		adj[source][dist]=1;
		adj[dist][source]=1;

	}

	for(int i=0;i<node;i++){
		for(int j=0;j<node;j++){
			System.out.print(adj[i][j]);
		}
		System.out.println();
	}
}	

}