package Backtracking;

public class KinghtsTour3 {
    private static int[][] board;
    private static int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1};
    private static int moves;

    public static boolean tour(int x, int y, int n) {
        if (moves == n * n) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nextX = x + xMoves[i];
            int nextY = y + yMoves[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 0) {
                board[nextX][nextY] = moves++;
                if (tour(nextX, nextY, n)) {
                    return true;
                } else {
                    board[nextX][nextY] = 0;
                    moves--;
                }
            }
        }
        return false;
    }
    static void printar(int ar[][]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.printf("%4d",ar[i][j]);
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 9;
        board = new int[n][n];
        moves = 1;
        if(tour(0, 0, n)){
            printar(board);
        }
    }
}
