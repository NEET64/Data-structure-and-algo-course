package DynamicProgramming;

import java.util.Arrays;

public class MatrixChainMultiplication {
    static int mcm(int ar[], int i, int j, int[][] dp){
        if(i == j) return 0;
        int ans = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            ans = Math.min(ar[i-1]*ar[k]*ar[j] + mcm(ar, i, k, dp) + mcm(ar, k+1, j, dp), ans);
        }

        return dp[i][j] = ans;
    }

    public static int tab(int ar[]){
        int dp[][] = new int[ar.length][ar.length];
        
        for (int len = 2  ; len < dp.length; len++) {
            for (int i = 1; i <= ar.length-len; i++) {
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(ar[i-1]*ar[k]*ar[j] + dp[i][k] + dp[k+1][j], dp[i][j]);
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        
        return dp[1][ar.length-1];
    }   
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 3};
        int dp[][] = new int[ar.length][ar.length];

        System.out.println(mcm(ar, 1, ar.length-1, dp));
        System.out.println(tab(ar));
    }   
}