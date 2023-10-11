import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgo {
    static class Edge implements Comparable<Edge>{
        int src, des, wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e){
            return this.wt-e.wt;
        }
    }

    public static void create(ArrayList<Edge> graph, int V){
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
        init(V);
    }


    static int[] par, rank;

    public static void init(int n){
        par = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x){
        if(par[x] == x) return x;

        return par[x] = find(par[x]);
    }

    public static boolean union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(parA == parB) return true;

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]) par[parA] = parB;
        else par[parB] = parA;

        return false;
    } 

    public static int kruskals(ArrayList<Edge> graph, int V){
        Collections.sort(graph);

        int count=0;
        int cost=0;

        for (int i = 0; i < graph.size(); i++) {
            Edge e = graph.get(i);

            if(!union(e.src, e.des)){
                cost += e.wt;
                count++;
            }
        }
        if(count != V-1) return -1;
        return cost;
    } 

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();

        int V = 4;
        create(graph, V);
        Collections.sort(graph);

        System.out.println(kruskals(graph, V));
    }
}
