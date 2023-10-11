package Backtracking;

public class array {
    public static void setar(int ar[], int i) {
        if(i==ar.length){
            printar(ar);
            return;
        }
        ar[i] = i+1;
        setar(ar, i+1);
        ar[i] -= 2;
    }
    
    public static void printar(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[] = new int[5];

        setar(ar, 0);
        System.out.println();
        printar(ar);

    }
}
