package DynamicProgramming;

public class RodCutting {
    public static int cutRod(int val[], int n) {
        //same code as unbounded knapsack
        int dp[][] = new int[val.length+1][n+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                
                if(i <= j){
                    dp[i][j] = Math.max(dp[i][j-i]+val[i-1], dp[i-1][j]);
                }else dp[i][j] = dp[i-1][j];
            }
        }
        
        return dp[n][n];
    }
    public static void main(String[] args) {
        int val[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;

        System.out.println(cutRod(val, n));
    }
}
