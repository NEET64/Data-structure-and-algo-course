package Recursion;

public class Question1 {

    static void find(int ar[], int key, int ptr){
        if(ptr >= ar.length){
            return;
        }
        if(ar[ptr] == key){
            System.out.print(ptr+" ");
        }
        find(ar, key, ptr+1);
    }

    public static void main(String[] args) {
        int ar[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};

        find(ar, 2, 0);
    }
}
