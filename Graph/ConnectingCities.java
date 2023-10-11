import java.util.*  ;
public class ConnectingCities {
    public static  class Pair{
        int v, cost;
        Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }
    }

    @SuppressWarnings("unchecked")
    public static int getMinimumCost(int n, int m, int[][] connections) {
        // Write your code here.
        ArrayList<Pair>[] graph = new ArrayList[n+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);

        for(int i=0; i<=n; i++) graph[i] = new ArrayList<>();
        for(int i[] : connections){
            graph[i[0]].add(new Pair(i[1], i[2]));
            graph[i[1]].add(new Pair(i[0], i[2]));
        }

        boolean vis[] = new boolean[n+1];
        int count=0;
        int cost=0;
        pq.add(new Pair(1, 0));
        while(!pq.isEmpty()){
            Pair cur = pq.poll();

            if(!vis[cur.v]){
                vis[cur.v] = true;
                cost += cur.cost;
                count++;
                for(Pair i : graph[cur.v]){
                    pq.add(i);
                }
            }
        }
        
        return count>=n?cost:-1;
    }
    public static void main(String[] args) {
        // https://www.codingninjas.com/codestudio/problems/connecting-cities-with-minimum-cost_1386586
    }
}
