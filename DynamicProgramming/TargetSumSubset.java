package DynamicProgramming;

public class TargetSumSubset {
    public static boolean find(int[] ar, int sum){
        boolean dp[][] = new boolean[ar.length+1][sum+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(ar[i-1] <= j && dp[i-1][j-ar[i-1]]) dp[i][j] = true;
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[ar.length][sum];
    }
    public static void main(String[] args) {
        // int ar[] = {3, 34, 4, 12, 5, 2};
        // int sum = 9;

        int ar[] = {3, 34, 4, 12, 5, 2};
        int sum = 30;

        System.out.println(find(ar, sum));
    }
}


// https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1