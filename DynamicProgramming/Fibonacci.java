package DynamicProgramming;

public class Fibonacci {
    public static long f(int n, long[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0) return dp[n];
        return dp[n] = f(n-1,dp) + f(n-2, dp);
    }
    public static long fib(int n) {
        long dp[] = new long[n+1];
        return f(n, dp);
    }
    public static void main(String[] args) {
        System.out.println(fib(150));
    }
}
