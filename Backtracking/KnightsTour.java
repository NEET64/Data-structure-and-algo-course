package Backtracking;

public class KnightsTour {

    public static boolean findPer(int ar[][], int row, int col, int count) {
        if(count == ar.length*ar.length+1){
            return true;
        }else if(row >= ar.length || row < 0 || col >= ar.length || col < 0){
            return false;
        }

        if(ar[row][col] != 0){
            return false;
        }
        
        ar[row][col] = count++;
        if(findPer(ar, row+2, col-1, count) ||
        findPer(ar, row+2, col+1, count) ||
        findPer(ar, row+1, col+2, count) ||
        findPer(ar, row-1, col+2, count) ||
        findPer(ar, row-2, col-1, count) || 
        findPer(ar, row-2, col+1, count) ||
        findPer(ar, row+1, col-2, count) ||
        findPer(ar, row-1, col-2, count)) return true;
        ar[row][col] = 0;

        return false;
    }
    public static void print(int ar[][]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.printf("%4d",ar[i][j]);
            }System.out.println();
        }System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        int ar[][] = new int[n][n];
        
        if(findPer(ar, 0, 0, 1)){
            print(ar);
        }else System.out.println("no solution");
    }
}
