package Backtracking;

public class N_Queens {
    static int count = 0;
    public static void printBoard(String ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j]+" ");
            }System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(String ar[][], int row, int col) {
        for (int i = row; i >= 0; i--) {
            if(ar[i][col].equals("Q")){
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >=0; i--,j--) {
            if(ar[i][j].equals("Q")){
                return false;
            }
        }for (int i = row, j = col; i >= 0 && j < ar[0].length; i--,j++) {
            if(ar[i][j].equals("Q")){
                return false;
            }
        }
        return true;
    }

    public static void putQueens(String ar[][], int row){
        if(row == ar.length){
            printBoard(ar);
            // count++;
            return;
        }
        for (int i = 0; i < ar.length; i++) {
            if(isSafe(ar, row, i)){
                ar[row][i] = "Q";
                putQueens(ar, row+1);
                ar[row][i] = ".";
            }else continue;
        }
        
    }

    public static void main(String[] args) {
        int n = 4;

        String ar[][] = new String[n][n];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = ".";
            }
        }
        putQueens(ar, 0);
        
        // System.out.println(count);
    }
}
