package Sorting;

// import java.util.Arrays;

public class Lecture {
    public static void printAr(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    public static void bubbleSort(int ar[]) {
        for (int i = 0; i < ar.length-1; i++) {
            int sort = 0;
            for (int j = 0; j < ar.length-i-1; j++) {
                if (ar[j] > ar[j+1]) {
                    int t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t; 
                    sort++;
                }
            }
            if (sort == 0) {
                break;
            }
        }
        printAr(ar);
    }

    public static int min(int ar[], int index){
        int min = index;
        for (int i = index+1; i < ar.length; i++) {
            if(ar[min] > ar[i]){
                min = i;
            }
        }
        return min;
    }
    public static void selectionSort(int ar[]) {
        int m;
        for (int i = 0; i < ar.length; i++) {
            int t = ar[i];
            m = min(ar, i);
            ar[i] = ar[m];
            ar[m] = t;
        }
        printAr(ar);
    }

    public static void insertionSort(int ar[]){
        for (int i = 1; i < ar.length; i++) {
            int curr = ar[i];
            int prev = i-1;
            while (prev >= 0 && ar[prev] > curr) {
                ar[prev+1] = ar[prev];
                prev--;
            }
            ar[prev+1] = curr;
        }
        printAr(ar);
    }

    public static int max(int ar[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            max = Math.max(ar[i], max);
        }
        return max;
    }
    public static void countSort(int ar[]){
        int n = max(ar) + 1;
        int count[] = new int[n];
        
        for (int i = 0; i < ar.length; i++) {
            count[ar[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        int result[] = new int[ar.length];
        for (int i = ar.length-1; i >= 0; i--) {
            count[ar[i]]--;
            result[count[ar[i]]] = ar[i];
        }
        for (int i = 0; i < result.length; i++) {
            ar[i] = result[i];
        }
        printAr(ar);
        // System.out.println(count[5]);
    }
    public static void main(String[] args) {
        int ar[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(ar);
        // System.out.println();

        // selectionSort(ar);
        // System.out.println();

        // insertionSort(ar);
        // System.out.println();

        // Arrays.sort(ar);
        // printAr(ar);

        countSort(ar);
    }
}
