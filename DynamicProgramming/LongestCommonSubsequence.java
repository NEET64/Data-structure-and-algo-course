package DynamicProgramming;

public class LongestCommonSubsequence {

    public static int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();

        for(int i=1; i<=t1.length; i++){
            for(int j=1; j<=t2.length; j++){
                if(t1[i-1] == t2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[t1.length][t2.length];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("neet", "nethekinget"));
    }
}
