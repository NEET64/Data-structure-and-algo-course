package PriorityQueue;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int ar[]) {
        int n = ar.length;
        // step 1 : maxheap
        for (int i = n/2; i >= 0; i--) {
            heapify(i, n, ar);
        }

        // step 2 : push largest at the end
        for (int i = n-1; i >= 0; i--) {
            // swap largest and last
            int temp = ar[0];
            ar[0] = ar[i];  
            ar[i] = temp;
            
            heapify(0, i, ar);
        }
    }
    public static void heapify(int i, int n, int ar[]) {
        int left = 2*i+1;
        int right = 2*i+2;

        int maxIdx = i;

        if(left < n && ar[maxIdx] > ar[left]){
            maxIdx = left;
        }
        if(right < n && ar[maxIdx] > ar[right]){
            maxIdx = right;
        } 

        if(maxIdx != i){
            int temp = ar[i];
            ar[i] = ar[maxIdx];
            ar[maxIdx] = temp;
            heapify(maxIdx, n, ar);
        }
    }
    public static void main(String[] args) {
        int ar[] = {9,1,6,2,5,4};
        System.out.println(Arrays.toString(ar));
        heapSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
