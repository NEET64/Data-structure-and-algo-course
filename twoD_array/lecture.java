package twoD_array;

public class lecture {
    public static void spiral(int ar[][]) {
        int startRow = 0;
        int endRow = ar.length-1;
        int startCol = 0;
        int endCol = ar[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(ar[startRow][i]+" ");
            }
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(ar[i][endCol]+" ");
            }
            for (int i = endCol-1; i >= startCol; i--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(ar[endRow][i]+" ");
            }
            for (int i = endRow-1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(ar[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static int diagonalSum(int ar[][]){
        int sum = 0;
        
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i][i];
            
            if (i != ar.length-i-1)
            sum += ar[i][ar.length-i-1];
        }
        return sum; 
    }

    public static void stairCaseSearch(int ar[][], int key){
        int i = ar.length-1, j = 0;
        while (i >= 0 && j < ar.length) {
            if (ar[i][j] == key) {
                System.out.println(i+" "+j);
                return;
            } else if (ar[i][j] > key) {
                i--;
            } else {
                j++;
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int ar[][] = new int[4][4];
        int count = 1;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                ar[i][j] = count;
                count++; 
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println();

        stairCaseSearch(ar, 3);
    }
}
