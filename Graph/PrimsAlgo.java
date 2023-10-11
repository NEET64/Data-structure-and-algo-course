import java.util.*;
public class PrimsAlgo {
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

    
    @SuppressWarnings("unchecked")
    public static List<Edge>[] create(){
        int V = 4;
        List<Edge> graph[]  = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));       

        return graph;
    }

    public static class Pair implements Comparable<Pair>{
        int v, cost;
        public Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static int prims(List<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 

        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            if(!vis[cur.v]){
                vis[cur.v] = true;
                finalCost += cur.cost;

                for (int i = 0; i < graph[cur.v].size(); i++) {
                    Edge e = graph[cur.v].get(i);
                    pq.add(new Pair(e.des, e.wei));
                }
            }
            
        }

        return finalCost;
    }
    public static void main(String[] args) {
            List<Edge>[] graph = create();

            System.out.println(prims(graph));
    }    
}
