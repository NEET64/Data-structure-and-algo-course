import java.util.*;

public class BFS_DFS {
    static public class Edge{
        int src;
        int des;
        int wei;

        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wei = w;   
        }
    }
    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int cur = q.remove();
            if(!vis[cur]){
                System.out.println(cur);
                vis[cur] = true;
                for (int i = 0; i < graph[cur].size(); i++) {
                    q.add(graph[cur].get(i).des);
                }
            }
        }
    }

    public static void dfsHelp(ArrayList<Edge>[] graph, boolean[] vis, int cur){
        vis[cur] = true;
        System.out.println(cur);

        for (int i = 0; i < graph[cur].size(); i++) {
            if(!vis[graph[cur].get(i).des]){
                dfsHelp(graph, vis, graph[cur].get(i).des);
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        dfsHelp(graph, vis, 0);
    }
    public static void main(String[] args) {
    
            //     1 ----- 3
            //    /        | \
            //   /         |  \ 
            //  /          |   \
            // 0           |    5 ------ 6
            //  \          |   /
            //   \         |  /
            //    \        | /
            //     2 ----- 4
    
        int V = 7;
        @SuppressWarnings("unchecked") 
        ArrayList<Edge> graph[]  = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));        
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));


        graph[6].add(new Edge(6, 5, 1));

        bfs(graph);
        dfs(graph);
    }
}
