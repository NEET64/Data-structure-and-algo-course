package DynamicProgramming;

public class KnapSack01 {
    static int rec(int wt[], int val[], int i, int w, int v){
        if(wt.length == i || w == 0) return v;
        int dale = -1;
        int nadale = -1;
        if(wt[i] <= w){
            dale = rec(wt, val, i+1, w-wt[i], v+val[i]);
        }
        nadale = rec(wt, val, i+1, w, v);
        return Math.max(dale, nadale);
    }

    static int tab(int wt[], int val[], int W){
        int n = wt.length;
        int dp[][] = new int[n+1][W+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int w = wt[i-1];

                if(w <= j){
                    int dala = v+dp[i-1][j-w];
                    int nai = dp[i-1][j];
                    dp[i][j] = Math.max(dala, nai);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
        
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int w = 7;

        System.out.println(rec(wt, val, 0, w, 0));
        System.out.println(tab(wt, val, w));
    }
}
// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1