package Recursion;

public class Question3 {
    public static void findLength(String str, int ptr, int count) {
        try{
            str.charAt(ptr);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("the length of the string is: "+count);
            return;
        }

        count++; ptr++;

        findLength(str, ptr, count);
    }

    public static void main(String[] args) {
        String str = "neet";

        findLength(str,0,0);
    }
}
