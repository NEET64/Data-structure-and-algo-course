package Backtracking;

public class GridWays {
    static int count = 0;
    public static void findway(int sr,int sc, int n, int m) {
        if(sr == m && sc == n){
            count++;
            return;
        }
        if(sr == m){
            findway(sr, sc+1, n, m);
        }else if(sc == n){
            findway(sr+1, sc, n, m);
        }else {
            findway(sr+1, sc, n, m);
            findway(sr, sc+1, n, m);
        }

    }
    public static int findGoodWay(int sr,int sc, int n, int m){
        if(sr == m-1 && sc == n-1){
            return 1;
        }else if(sr == m || sc == n){
            return 0;
        }

        return findGoodWay(sr+1, sc, n, m) + findGoodWay(sr, sc+1, n, m);
    }
    public static void main(String[] args) {
        int n = 2   , m = 10;

        findway(0,0,n-1,m-1);
        System.out.println("My way: "+count);

        System.out.println("Mam ways: "+findGoodWay(0, 0, n, m));
    }
}
