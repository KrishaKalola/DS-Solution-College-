import java.util.*;

public class BFS{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	graph g=new graph(4);
	g.addEdge(0,1);
	g.addEdge(0,2);
	g.addEdge(1,0);
	g.addEdge(1,2);
	g.addEdge(2,1);
	g.addEdge(2,0);

	g.bfs(0);
	}

	
}


class graph {
   int V;
   LinkedList<Integer> adj[];

  // Create a graph
  graph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Add edges to the graph
  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // BFS algorithm
  void bfs(int s) {

    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      System.out.print(queue.poll() + " ");

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
}

