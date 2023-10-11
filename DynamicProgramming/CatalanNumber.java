package DynamicProgramming;

import java.math.BigInteger;

public class CatalanNumber {
    public static BigInteger f(int n, BigInteger dp[]){
        if(n == 0 || n == 1) return BigInteger.valueOf(1);
        
        if(dp[n] != null) return dp[n];
        
        BigInteger sum=BigInteger.valueOf(0);
        for(int i=0; i<n; i++){
            BigInteger a = f(i,dp);
            sum = sum.add(a.multiply(f(n-i-1,dp))); 
        }
        return dp[n] = sum;
    }

    public static void main(String[] args) {

    }
}
