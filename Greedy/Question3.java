import java.util.Arrays;

public class Question3 {
    public static String getSmallestString(int n, int k) {
        // StringBuilder sb = new StringBuilder("");
        // k-=n;
        // while(k>0){
        //     int i = Math.min(25, k);
        //     char c = (char)(i+'a');
        //     sb.append(c);
        //     k -= i;
        //     if(i==0) break;
        // }
        // while(sb.length() < n){
        //     sb.append('a');
        // }
        // return sb.reverse().toString();
        char ar[] = new char[n];
        Arrays.fill(ar, 'a');
        k-=n;
        while(k>0){
            ar[--n] = (char)(Math.min(25, k)+'a');
            k -= Math.min(25, k);
        }
        return String.valueOf(ar);
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 73;

        System.out.println(getSmallestString(n, k));
    }
}

// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/