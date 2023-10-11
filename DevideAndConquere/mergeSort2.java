package DevideAndConquere;

public class mergeSort2 {
    static void mergeSort(int ar[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(ar, si, mid);
        mergeSort(ar, mid+1, ei);

        merge(ar, si, mid, ei);
    }

    static void merge(int ar[],int si, int mid, int ei){
        int naya[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int ptr = 0;

        while(i<=mid && j<=ei){
            if(ar[i] < ar[j]){
                naya[ptr] = ar[i];
                i++;
            }else{
                naya[ptr] = ar[j];
                j++;
            }ptr++;
        }
        while(i<=mid){
            naya[ptr] = ar[i];
            ptr++; i++;
        }
        while(j<=ei){
            naya[ptr] = ar[j];
            ptr++; j++;
        }
        for (int t=0, k=si;t<naya.length; k++,t++) {
            ar[k] = naya[t];
        }
    }

    static void show(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[] = {9,8,7,6,5,4,3,2,1};
        mergeSort(ar, 0, ar.length-1);
        show(ar);
    }
}
