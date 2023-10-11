import java.util.*;
public class BellmanFord {
    static class Edge{
        int src, des, wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    static void create(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

    //         *1*-------4
    //        / |  (-1)  *
    //    (2)/  |        | 
    //      /   |        |   
    //     0    |(-4) (4)|   
    //      \   |        | 
    //    (4)\  |        | 
    //        \ *   (2)  |
    //         *2-------*3

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[]  graph = new ArrayList[V];
        create(graph);

        // int src=0;

        int ar[] = bellman(graph);

        System.out.println(Arrays.toString(ar));
    }

    private static int[] bellman(ArrayList<BellmanFord.Edge>[] graph) {
        int dis[] = new int[graph.length];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0] = 0;
        for (int k = 0; k < graph.length; k++) {
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    
                    if(dis[e.src] != Integer.MAX_VALUE && dis[e.src] + e.wt < dis[e.des]){
                        dis[e.des] = dis[e.src] + e.wt;
                    }

                }
            }
        }
        
        return dis;
    }
}
