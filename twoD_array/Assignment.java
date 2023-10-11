package twoD_array;

public class Assignment {

    public static int question1(int ar[][]){
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if(ar[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static int question2(int ar[][]){
        int sum = 0;
        for (int j = 0; j < ar.length; j++) {
            sum += ar[1][j];
        }
        return sum;
    }

    public static void question3(int ar[][]){
        int row = ar.length; 
        int col = ar[0].length;
        int temp[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[j][i] = ar[i][j];
            }
        }
        printA(ar);
        System.out.println();
        printA(temp);
    }

    public static void printA(int ar[][]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ar1[][] = {{4,7,8},{8,8,7}};
        System.out.println("the number of 7s are "+question1(ar1));

        int ar2[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("the sum of the second row is "+question2(ar2));
        question3(ar1);
    }
}
