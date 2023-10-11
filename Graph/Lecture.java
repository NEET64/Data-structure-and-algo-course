// import java.util.ArrayList;

public class Lecture {
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
    public static void main(String[] args) {
        //     (5)
        // 0 ------ 1
        //         / \
        //        /   \
        //   (1) /     \ (3)
        //      /       \     
        //     2 ------- 3
        //     |     (1)
        //     |(2)
        //     |   
        //     4
        
        // ArrayList<Edge> graph[]  = new ArrayList[5];

        // for (int i = 0; i < graph.length; i++) {
        //     graph[i] = new ArrayList<>();
        // }

        // graph[0].add(new Edge(0, 1, 5));
    

        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 2, 1));
        // graph[1].add(new Edge(1, 3, 3));

        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));
        // graph[2].add(new Edge(2, 4, 2));

        // graph[3].add(new Edge(3, 1, 3));
        // graph[3].add(new Edge(3, 2, 1));
        
        // graph[4].add(new Edge(4, 2, 2));

        // for (int i = 0; i < graph.length; i++) {
        //     System.out.println(graph[i].size());
        // }
    
    }
}
