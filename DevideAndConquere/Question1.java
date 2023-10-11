package DevideAndConquere;

public class Question1 {
    public static void mergeSort(String ar[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        mergeSort(ar, si, mid);
        mergeSort(ar, mid+1, ei);
        merge(ar, si, mid, ei);
    }
    public static void merge(String ar[], int si, int mid, int ei){
        String na[] = new String[ei-si+1];

        int ptr = 0;
        int i = si;
        int j = mid+1;

        while(i<=mid && j<=ei){
            if(ar[i].compareTo(ar[j])<0){
                na[ptr] = ar[i];
                i++;
            }else{
                na[ptr] = ar[j];
                j++;
            } 
            ptr++;
        }
        while (i<=mid) {
            na[ptr] = ar[i];
            ptr++; i++;
        }
        while (j<=ei) {
            na[ptr] = ar[j];
            ptr++; j++;
        }

        for (int k = 0,a = si; k < na.length; k++,a++) {
            ar[a] = na[k];
        }
    }

    public static void show(String ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        String ar[] = {"sun","earth","mars","mercury"};
        show(ar);
        System.out.println();
        mergeSort(ar, 0, ar.length-1);
        show(ar);
    }
}
