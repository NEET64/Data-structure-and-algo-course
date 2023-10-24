package Backtracking;

public class Sudoku {
    public static void printsudoku(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean ifSafe(int sudoku[][], int row, int col, int i) {
        //check vertical
        for (int j = 0; j < sudoku.length; j++) {
            if(row == j) continue;
            if(sudoku[j][col] == i){
                return false;
            }
        }

        //check horizontal
        for(int j = 0; j < sudoku.length; j++) {
            if(col == j) continue;
            if(sudoku[row][j] == i){
                return false;
            }
        }

        //check in the box
        int sr=0, er=3, sc=0, ec=3;
        if(row < 3){
            sr=0; er=3;
        }else if(row<6){
            sr=3; er =6;
        }else if(row < 9){
            sr=6; er=9;
        }
        if(col < 3){
            sc=0; ec=3;
        }else if(col<6){
            sc=3; ec =6;
        }else if(col < 9){
            sc=6; ec=9; 
        }
        
        for (int j = sr; j < er; j++) {
            for (int j2 = sc; j2 < ec; j2++) {
                if(sudoku[j][j2] == i){
                    return false;
                }
            }
        }


        return true;
    }
    public static void solve(int sudoku[][], int row, int col) {
        if(row>=sudoku.length){
            printsudoku(sudoku);
            return;
        }

        int nextRow = row, nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            solve(sudoku, nextRow, nextCol);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if(ifSafe(sudoku, row, col, i)){
                sudoku[row][col] = i;
                solve(sudoku, nextRow, nextCol);
            }
        }
        sudoku[row][col]=0;
    }
    public static void main(String[] args) {
        int sudoku[][] = {
            {6,9,0,0,5,0,0,0,4},
            {0,5,1,0,0,0,2,0,0},
            {0,0,0,0,3,4,1,0,0},
            {7,4,0,0,2,0,0,0,0},
            {0,0,6,5,0,7,9,0,0},
            {0,0,0,0,4,0,0,8,7},
            {0,0,7,3,8,0,0,0,0},
            {0,0,5,0,0,0,6,3,0},
            {8,0,0,0,6,0,0,5,1}
        };
        
        solve(sudoku, 0, 0);

    }
}
