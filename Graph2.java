import java.util.*;
//using map
public class Graph2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		Map<Integer,List<Integer>> adj= new HashMap<>();

		System.out.println("Enter no. of edges:");
		int edges=sc.nextInt();
		
		for(int i=0;i<edges;i++){
			System.out.println("Enter a source");
			int source=sc.nextInt();
			System.out.println("Enter a destination:");
			int dist=sc.nextInt();
			if(!adj.containsKey(source)){
				adj.put(source,new ArrayList<Integer>());
			}
			adj.get(source).add(dist);	
		}

		System.out.println("Maps are "+adj.entrySet());
	}
}