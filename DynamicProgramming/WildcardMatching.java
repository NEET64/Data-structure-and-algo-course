package DynamicProgramming;

public class WildcardMatching {
    public boolean isMatch(String S, String P) {
        char[] s = S.toCharArray();
        char[] p = P.toCharArray();
        int m = s.length, n = p.length;
        boolean dp[][] = new boolean[m+1][n+1];

        dp[0][0] = true;

        for(int j=1; j<=n; j++){
            if(p[j-1] == '*') dp[0][j] = dp[0][j-1];
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(p[j-1] == '*') dp[i][j] = (dp[i][j-1] || dp[i-1][j]);
                else if(p[j-1] == '?' || s[i-1] == p[j-1]) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = false;
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        // https://leetcode.com/problems/wildcard-matching/
        // https://practice.geeksforgeeks.org/problems/wildcard-string-matching1126/1
    }
}
