
import java.util.*;
 
class o2_BFS_adjecency_list {
 
    // A utility function to add an edge in an
    // undirected graph
    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
 
    // A utility function to print the adjacency list
    // representation of graph
    static void
    printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                               + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "
                                 + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
 
    static  public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        
        ArrayList<Integer> bfs = new ArrayList<>(); 
        boolean vis[] = new boolean[V]; 
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0); 
        vis[0] = true; 
        
        while (!q.isEmpty())
        {
            Integer node = q.poll();
            bfs.add(node); 
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for(Integer it: adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true; 
                    q.add(it); 
                } 
            }
        }
        
        return bfs; 
        
        // Code here
    }
    // Driver Code
    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer> > adj
            = new ArrayList<ArrayList<Integer> >(V);
 
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
 
        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
 
        printGraph(adj);
        ArrayList<Integer> ans=bfsOfGraph(V,adj);
        for (int i =0;i<ans.size();i++) {
            System.out.println(ans.get (i));
        }

    }
}