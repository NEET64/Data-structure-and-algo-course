package DynamicProgramming;

public class ClimbingStairs {

    public static int memo(int n, int[] dp){
        if(n == 1 || n == 2) return n;

        if(dp[n] != 0) return dp[n];

        return dp[n] = memo(n-1, dp) + memo(n-2, dp);
    }

    public static int tab(int n){
        if(n == 1 || n == 2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 10;

        int[] dp = new int[n+1];
        System.out.println(memo(n, dp));
        
        System.out.println(tab(n));
    }
}
// https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1