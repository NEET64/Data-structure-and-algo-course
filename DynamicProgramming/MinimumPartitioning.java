package DynamicProgramming;

public class MinimumPartitioning {
    public static int fill(int ar[], int i, int[][] dp,int sum, int val){
        if(i == ar.length || sum == 0) return val;
        if(dp[i][sum] != 0) return dp[i][sum];
        if(ar[i] <= sum){
            int dale = fill(ar, i+1, dp, sum-ar[i], val+ar[i]);
            int nadale = fill(ar, i+1, dp, sum, val);

            dp[i][sum] = Math.max(dale, nadale);
        }else dp[i][sum]=  fill(ar, i+1, dp, sum, val);

        return dp[i][sum];
    }

    public static void main(String[] args) {
        int nums[] = {1,6,11,5};
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int dp[][] = new int[nums.length+1][sum+1];
        int total = fill(nums, 0, dp, sum/2, 0);
        System.out.println(total);

        int a = total;
        int b = sum-total;

        System.out.println(Math.abs(a-b));
    }
}
