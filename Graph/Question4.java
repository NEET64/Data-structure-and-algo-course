public class Question4 {
    public int find(int[][] grid, boolean[][] vis, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || vis[i][j] || grid[i][j] == 0) return 0;

        vis[i][j] = true;

        int up = find(grid, vis, i-1, j);
        // int upr = find(grid, vis, i-1, j+1);
        // int upl = find(grid, vis, i-1, j-1);
        int left = find(grid, vis, i, j-1);
        int right = find(grid, vis, i, j+1);
        int down = find(grid, vis, i+1, j);
        // int downr = find(grid, vis, i+1, j+1);
        // int downl = find(grid, vis, i+1, j-1);

        // return up+upl+upr+left+right+down+downl+downr+1;
        return up+left+right+down+1;

    }
    
    public int findMaxArea(int[][] grid)
    {
        boolean vis[][] = new boolean[grid.length][grid[0].length];

        int max = Integer.MIN_VALUE;

        for(int i=0;i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    max = Math.max(max, find(grid, vis, i, j));
                }
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }

    public static void main(String[] args) {
        // https://leetcode.com/problems/max-area-of-island/
        // https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1
    }
}
