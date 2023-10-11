import java.util.*;
public class Dijkstra {
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

    //         *1-------*3
    //        / |   (7)  *\
    //    (2)/  |        | \(1)
    //      /   |        |  * 
    //     0    |(1)  (2)|   5
    //      \   |        |  *
    //    (4)\  |        | /(5)
    //        \ *   (3)  |/
    //         *2-------*4

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static int[] dijkstra(ArrayList<Edge> graph[], int src){
        int dis[] = new int[graph.length];

        for (int i = 0; i < dis.length; i++) {
            if(i != src){
                dis[i] = Integer.MAX_VALUE;
            } 
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, src)   );

        while(!pq.isEmpty()){
            Pair cur = pq.remove();
            if(!vis[cur.n]) {
                vis[cur.n] = true;
                for (int i = 0; i < graph[cur.n].size(); i++) {
                    Edge e = graph[cur.n].get(i);

                    int u = e.src;
                    int v = e.des;
                    int w = e.wt;

                    if(dis[u]+w < dis[v]){
                        dis[v] = dis[u]+w;
                    }
                    pq.add(new Pair(v, w));
                }
            }
        }

        return dis;
    }


    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[]  graph = new ArrayList[V];
        create(graph);

        int src=0;

        int ar[] = dijkstra(graph, src);

        System.out.println(Arrays.toString(ar));
    }
}
