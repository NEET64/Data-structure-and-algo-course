import java.util.*;
public class KosarajuAlgo {
    static class Edge{
        int src, des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    @SuppressWarnings("unchecked")
    static ArrayList<Edge>[] createGraph(int V){
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

        return graph;
    }

    public static void topSort(ArrayList<Edge>[] graph, boolean[] vis, int cur, Stack<Integer> s){
        vis[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);

            if(!vis[e.des]){
                topSort(graph, vis, e.des, s);
            }
        }
        s.push(cur);
    }

    @SuppressWarnings("unchecked")
    public static void kosoraju(ArrayList<Edge>[] graph, int V){
        // topological sorting
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < vis.length; i++) {
            if(!vis[i]) topSort(graph, vis, i, st);
        }

        // tanspose the graph - reverse every edge
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < transpose.length; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);

                transpose[e.des].add(new Edge(e.des, e.src));
            }
        }

        // do dfs accorging to sort on transpost graph

        while(!st.empty()){
            int cur = st.pop();
            if(!vis[cur]){
                dfs(transpose, vis, cur);
                System.out.println();
            }

        }
    }

    public static void dfs(ArrayList<Edge>[] graph, boolean vis[], int cur){
        vis[cur] = true;
        System.out.print(cur+" ");
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);

            if(!vis[e.des]){
                dfs(graph, vis, e.des);
            }
        }
    }
    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = createGraph(V);
        kosoraju(graph, V);


    }
}
