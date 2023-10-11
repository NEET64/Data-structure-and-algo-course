package DynamicProgramming;

public class StringConversion {
	public static  int minOperations(String str1, String str2) { 
	    int m = str1.length();
	    int n = str2.length();
	    
        int dp[][] = new int[m+1][n+1];
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

	    return m+n-dp[m][n]-dp[m][n];
	    // Your code goes here
	} 
    public static void main(String[] args) {
        // https://practice.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions0209/1
        System.out.println(minOperations("Neet", "TheKing"));
    }
}
