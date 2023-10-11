import java.util.Arrays;

public class MaximumLengthChainPair {
    public static void main(String[] args) {
        int ar[][] = {{1,2},{2,3},{3,4}};

        System.out.println(max(ar));
        
    }

    private static int max(int[][] ar) {
        int len=1;
        Arrays.sort(ar, (a,b) -> a[1]-b[1]);
        int last = ar[0][1];;
        for (int i = 1; i < ar.length; i++) {
            if(last < ar[i][0]){
                last = ar[i][1];
                len++;
            }
        }
        return len;
    }
}

//   https://leetcode.com/problems/maximum-length-of-pair-chain/description/

