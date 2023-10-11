package co_as2;

import java.lang.StringBuilder;

public class hexToBin {

    public static int[] toBin(int n){
        int ar[] = new int[4];
        for (int i = ar.length-1; i >= 0; i--) {
            int reminder = n%2;
            ar[i] = reminder;
            n = n/2;
        }
        return ar;
    }

    public static String hexaToBin(String hex){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int ar[];
            if (Character.getNumericValue(ch) < 10) {
                ar = toBin(Character.getNumericValue(ch));
                
            }else{
                ar = toBin(hex.charAt(i)-'A'+10);
            }
            for (int j = 0; j < ar.length; j++) {
                str.append(ar[j]);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(hexaToBin("F0F0F0F"));
    }
}
