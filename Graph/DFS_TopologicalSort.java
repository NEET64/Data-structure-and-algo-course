import java.util.*;

public class DFS_TopologicalSort {
    public static void dfs(int i, ArrayList<ArrayList<Integer>> graph, boolean[] vis, Stack<Integer> st){
        vis[i] = true;
        
        st.push(i);
        for (int j = 0; j < graph.get(i).size(); j++) {
            if(!vis[j]){
                dfs(j, graph, vis, st);
            }
        }
    }

    public static void sort(ArrayList<ArrayList<Integer>> graph) {
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {
            if(!vis[i]){
                dfs(i, graph, vis, st);
            }
        }

        
        while(!st.empty()){
            System.out.print(st.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // 2----> 3 ------> 1
        // ^                ^
        // |                |
        // |                |
        // |                |
        // 5-----> 0 <----- 4         

        graph.get(2).add(3);

        graph.get(3).add(1);

        graph.get(4).add(0);
        graph.get(4).add(1);

        graph.get(5).add(0);
        graph.get(5).add(2);


        // for (int i = 0; i < V; i++) {
        //     System.out.println(graph.get(i));
        // }
        
        sort(graph);

        
    }
}
