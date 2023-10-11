import java.util.*;
public class Question3 {
    class Pair{
        int i, j;
        Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();

        int fresh=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 2) q.add(new Pair(i, j));
                else if(grid[i][j] == 1) fresh++;
            }
        }
        if(fresh == 0) return 0;
        int time=0;
        int size=0;
        while(!q.isEmpty()){
            size = q.size();
            while(size-->0){
                Pair p = q.poll();
                if(p.j-1 >=0 && grid[p.i][p.j-1] == 1){
                    fresh--;
                    grid[p.i][p.j-1] = 2;
                    q.add(new Pair(p.i, p.j-1));
                }
                if(p.i-1 >=0 && grid[p.i-1][p.j] == 1){
                    fresh--;
                    grid[p.i-1][p.j] = 2;
                    q.add(new Pair(p.i-1, p.j));
                }
                if(p.j+1 < grid[0].length && grid[p.i][p.j+1] == 1){
                    fresh--;
                    grid[p.i][p.j+1] = 2;
                    q.add(new Pair(p.i, p.j+1));
                }
                if(p.i+1 < grid.length && grid[p.i+1][p.j] == 1){
                    fresh--;
                    grid[p.i+1][p.j] = 2;
                    q.add(new Pair(p.i+1, p.j));
                }
            }
            
            time++;
        }
        return fresh == 0 ? time-1 : -1;
    }

    public static void main(String[] args) {
        // https://leetcode.com/problems/rotting-oranges/submissions/
        // https://practice.geeksforgeeks.org/problems/rotten-oranges2536/1
    }
}
