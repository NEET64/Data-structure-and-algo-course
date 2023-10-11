import java.util.Arrays;

public class MinimumSubAbsoluteDiff {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {2, 1, 3};

        System.out.println(minimumSubAbsoluteDiff(a, b));
    }

    private static int minimumSubAbsoluteDiff(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.abs(a[i] - b[i]);
        }
        return sum;
    }
}

//https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1
