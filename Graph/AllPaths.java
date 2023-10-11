import java.util.*;
public class AllPaths {
    public static void dfs(int[][] graph,int src, ArrayList<Integer> cur, List<List<Integer>> list, int des){
        if(src == des){
            list.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0; i<graph[src].length; i++){
            cur.add(graph[src][i]);
            dfs(graph, graph[src][i], cur, list, des);
            cur.remove(cur.size()-1);
        }
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(0);
        dfs(graph, 0, cur, list, graph.length-1);
        return list;
    }

    public static void main(String[] args) {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};

        List<List<Integer>> list = allPathsSourceTarget(graph);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// https://leetcode.com/problems/all-paths-from-source-to-target/