import java.util.*;

public class CycleInGraph {

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] cur){
        vis[v] = true;
        cur[v] = true;
        for(int i: adj.get(v)){
            if(cur[i]) return true;
            if(!vis[i] && dfs(i, adj, vis, cur)) return true;
        }
        cur[v] = false;
        return false;
    }
    public boolean isCyclicDirected(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] cur = new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(dfs(i, adj, vis, cur)) return true;
            }
        }
        return false;
    }



    public boolean check(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int cur, int par){
        vis[cur] = true;
        for(int i=0; i<adj.get(cur).size(); i++){
            int des = adj.get(cur).get(i);
            if(!vis[des]){
                if(check(adj, vis, des, cur)) return true;
            }else if(vis[des] && des != par) return true;
        }
        return false;
    }
    public boolean isCycleUnDirected(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i] && check(adj, vis, i, -1)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Undirected Graph
        // https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

        // Directed Graph
        // https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
    }
}
