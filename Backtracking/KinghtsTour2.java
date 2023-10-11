package Backtracking;

public class KinghtsTour2 {
    static void printar(int ar[][]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.printf("%4d",ar[i][j]);
            }System.out.println();
        }
    }

    static boolean isSafe(int ar[][], int row, int col){
        return(row>=0 && row<ar.length && col>=0 && col<ar.length && ar[row][col] == -1);
    } 

    static boolean findpath(int ar[][], int count, int row, int col, int allR[], int allC[]){
        // base case 
        if(count == ar.length*ar.length){
            return true;
        }
        // kaam
        for (int i = 0; i < 8; i++) {
            int nr = row + allR[i];
            int nc = col + allC[i];
            if(isSafe(ar, nr, nc)){
                ar[nr][nc] = count;
                if(findpath(ar, count+1, nr, nc, allR, allC)){
                    return true;
                }else{
                     // backtracking 
                    ar[nr][nc] = -1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 9;
        int ar[][] = new int[n][n];
        int allR[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int allC[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = -1;
            }
        }
        ar[0][0] = 0;
        if(findpath(ar, 1, 0, 0, allR, allC)){
            printar(ar);
        }else{
            System.out.println("No Solution to this size of Board");
        }
    }
}
