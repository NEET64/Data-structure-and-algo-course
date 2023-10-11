import java.util.*;

public class BipartiteGraph {
    static public boolean bfs(int v, ArrayList<ArrayList<Integer>>adj, int[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        vis[v] = 1;
        
        while(!q.isEmpty()){
            int cur = q.remove();
            for(int i : adj.get(cur)){
                if(vis[i] == 0){
                    if(vis[cur] == 1){ vis[i] = 2;}
                    else{ vis[i] = 1;}
                    
                    q.add(i);
                }else if(vis[cur] == vis[i]) return false;
            }
        }
        return true;
    }
    static public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int vis[] = new int[V];
        for(int i=0; i<adj.size(); i++){
            if(vis[i] == 0 && !bfs(i, adj, vis)) return false; 
        }
        return true;
        
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            //     1 ----- 3
            //    /          \
            //   /            \ 
            //  /              \
            // 0                5 
            //  \              /
            //   \            /
            //    \          /
            //     2 ----- 4

        int V = 6;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(1);
        adj.get(3).add(5);

        adj.get(4).add(2);
        adj.get(4).add(5);

        adj.get(5).add(3);
        adj.get(5).add(4);


        for(ArrayList<Integer> i : adj){
            System.out.println(i);
        }
        System.out.println(isBipartite(V, adj));
    }
}

//  https://practice.geeksforgeeks.org/problems/bipartite-graph/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article