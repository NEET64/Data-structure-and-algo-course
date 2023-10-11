package Backtracking;

public class Question1 {
    //rat in the maze
    public static void findPath(int ar[][], int row, int col, String ans){
        if(row == ar.length-1 && col == ar.length-1){
            System.out.println(ans+" ");
            return;
        }else if(row >= ar.length ||row < 0 || col >= ar.length || col < 0){
            return;
        }else if(ar[row][col] == 0){
            return;
        }

        ar[row][col] = 0;
        findPath(ar, row+1, col, ans+"D");
        findPath(ar, row, col+1, ans+"R");
        findPath(ar, row, col-1, ans+"L");
        findPath(ar, row-1, col, ans+"U");
        ar[row][col] = 1;
    }
    public static void main(String[] args) {
        int ar[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 1, 1, 0, 0 },
            { 0, 1, 1, 1 } };

        findPath(ar, 0, 0, "");
    }
}
