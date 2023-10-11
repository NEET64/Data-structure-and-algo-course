package DevideAndConquere;

import java.util.Arrays;

public class Question2 {
    public static void findMajor(int ar[]){
        Arrays.sort(ar);
        int count = 0;
        int current = ar[0];
        int maxNum = ar[0];
        int maxCount = 0;
        for (int i = 0; i < ar.length; i++) {
            count = 0;
            current = ar[i];
            while(i<ar.length && current == ar[i]){
                count++;
                i++;
            }
            if (maxCount <= count) {
                maxNum = current;
                maxCount = count;
            }
        }
        System.out.println(maxNum);
    }
    public static void main(String[] args) {
        int ar[] = {2,2,1,1,1,2,2};
        findMajor(ar);
    }
}
