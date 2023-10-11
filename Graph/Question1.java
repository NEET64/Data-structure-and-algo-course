import java.util.*;

// CycleInUnDirectedBFS

public class Question1 {

    public boolean bfs(int V, ArrayList<ArrayList<Integer>> adj, boolean vis[], int s){
        Queue<Integer> q = new LinkedList<>();
        int parent[] = new int[V];
        q.add(s);
        while(!q.isEmpty()){
            int cur=  q.remove();
            // System.out.println(cur);
            // System.out.println(adj.get(cur));
            if(vis[cur]) return true;
            vis[cur] = true;
            for(int i=0; i<adj.get(cur).size(); i++){
                parent[adj.get(cur).get(i)] = cur;
                if(adj.get(cur).get(i) != parent[cur]) q.add(adj.get(cur).get(i));
            }
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        
        for(int i=0; i<V; i++){
            if(!vis[i] && bfs(V, adj, vis, i)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
    }
}