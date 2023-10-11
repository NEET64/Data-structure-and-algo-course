import java.util.*;

public class BFS_TopologicalSort {
    public static class Edge{
        int src;
        int des;
        int wei;

        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wei = w;
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Edge>[] createGarph(int V){
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 2----> 3 ------> 1
        // ^                ^
        // |                |
        // |                |
        // |                |
        // 5-----> 0 <----- 4         

        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 1, 0));

        graph[4].add(new Edge(4, 0, 0));
        graph[4].add(new Edge(4, 1, 0));
        
        graph[5].add(new Edge(5, 0, 0));
        graph[5].add(new Edge(5, 2, 0));

        return graph;
    }

    public static void calIndeg(ArrayList<Edge>[] graph, int[] indeg){
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                indeg[graph[i].get(j).des]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph){
        int[] indeg = new int[graph.length];
        calIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indeg.length; i++) {
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //bfs

        while(!q.isEmpty()){
            int cur = q.remove();
            System.out.print(cur+" ");
            for (int i = 0; i < graph[cur].size(); i++) {
                Edge e = graph[cur].get(i);
                indeg[e.des]--;
                if(indeg[e.des] == 0){
                    q.add(e.des);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph =  createGarph(6);

        topSort(graph);
    }
}
