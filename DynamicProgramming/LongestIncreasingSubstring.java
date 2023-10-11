
package DynamicProgramming;

import java.util.*;

public class LongestIncreasingSubstring {
    public int lengthOfLIS(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : a) set.add(i);
        int b[] = new int[set.size()];
        int ptr=0;
        for(int i : set){
            b[ptr++] = i;
        }
        Arrays.sort(b);
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        
        int dp[][] = new int[a.length+1][b.length+1];
        
        for(int i=1; i<=a.length; i++){
            for(int j=1; j<=b.length; j++){
                if(a[i-1] == b[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[a.length][b.length];
    }
    public static void main(String[] args) {
        // https://leetcode.com/problems/longest-increasing-subsequence/
    }
}
