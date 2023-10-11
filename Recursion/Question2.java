package Recursion;

public class Question2 {
    public static void toStr(int n) {
        String ar[] = {"zero ", "one ", "two ", "three", "four ", "five ", "six ", "seven ", "eight", "nine "};
        if(n == 0){
            return;
        }
        toStr(n/10);
        System.out.print(ar[n%10]);
        
    }
    public static void main(String[] args) {
        int n = 1947;
        toStr(n);
    }
}
