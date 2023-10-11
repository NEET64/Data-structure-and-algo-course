import java.util.ArrayList;
import java.util.List;

public class HasPath {
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

    static boolean hasPath(List<Edge>[] graph, int cur, int des, boolean[] vis){
        if(cur == des) return true;

        vis[cur] = true;
        for (int i = 0; i < graph[cur].size(); i++) {
            if(!vis[graph[cur].get(i).des] && hasPath(graph, graph[cur].get(i).des, des, vis)){
                return true;
            }
        }
        return false;
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
            List<Edge> graph[]  = new ArrayList[V];
    
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


            boolean[] vis = new boolean[V];

            System.out.println(hasPath(graph, 0, 6, vis));
    }
}
