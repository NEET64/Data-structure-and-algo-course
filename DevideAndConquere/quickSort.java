package DevideAndConquere;

public class quickSort {
    static void qSort(int ar[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivot = partition(ar, si, ei);
        qSort(ar, si, pivot-1);
        qSort(ar, pivot+1, ei);
    }

    static int partition(int ar[], int si, int ei){
        int pivot = ei;
        int ptr = si-1;
        for (int i = si; i < ei; i++) {
            if(ar[i]<ar[pivot]){
                ptr++;
                int temp = ar[i];
                ar[i] = ar[ptr];
                ar[ptr] = temp;
            }
        }
        for (int i = si; i < ei; i++) {
            if(ar[i]>=ar[pivot]){
                int temp = ar[i];
                ar[i] = ar[pivot];
                ar[pivot] = temp;
                pivot = i;
                break;
            }
        }
        return pivot;
    }
    
    static void show(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[] = {9,8,7,6,5,4};
        qSort(ar, 0, ar.length-1);
        show(ar);
    }
}   
