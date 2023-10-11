package DynamicProgramming;

public class UnboundedKnapsack {
    public static int knap(int wt[], int val[], int W){
        int N = wt.length;
        int dp[][] = new int[N+1][W+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(wt[i-1] <= j){
                    // this is magical change - (i-1) -> i
                    dp[i][j] = Math.max(dp[i][j-wt[i-1]]+val[i-1], dp[i-1][j]);
                }else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[N][W];
    }
    public static void main(String[] args) {
        
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int w = 7;
        
        System.out.println(knap(wt, val, w));
    }
}
