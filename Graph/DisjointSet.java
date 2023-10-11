import java.util.*;


//also called the union find
public class DisjointSet {
    static int n = 7;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init(){
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }

    public static int find(int x){
        if(par[x] == x){
            return x;
        }
        // this par[x] = find()  is called the "Path compression optimization in union find"
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else {
            par[parB] = parA;
        }
    } 
    public static void main(String[] args) {
        init();

        union(1, 2);
        System.out.println(find(2));

        union(3, 4);
        union(3, 5);
        union(1, 6);
        System.out.println(find(4));
        System.out.println(find(6));

        union(1, 5);
        System.out.println(find(4));
        System.out.println(find(5));
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(rank));
    }
}
