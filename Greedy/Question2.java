public class Question2 {

    public static int kthLargestOdd(int s, int e, int k) {
        if((e&1) == 0) e--;
        return e-(2*k-1)+1;
    }
    public static void main(String[] args) {
        int start = -10;
        int end = 19;
        int k = 0;

        System.out.println(kthLargestOdd(start, end, k));
    }
}


// https://www.geeksforgeeks.org/kth-largest-odd-number-in-a-given-range/             
// this is not gfg practice!!