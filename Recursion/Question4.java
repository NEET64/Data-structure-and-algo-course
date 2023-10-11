package Recursion;

public class Question4 {
    public static boolean isValid(String str){
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return true;
        }else return false;
    }

    public static void countSubStr(String str, int si, int ei, int count){
        if(si == str.length()){
            System.out.println("the number of substrings are: "+count);
            return;
        }
        if(ei > str.length()){
            return;
        }
        if(isValid(str.substring(si, ei))){
            // System.out.println(str.substring(si, ei)+" ");
            count++;
        }
        if(ei == str.length()){
            countSubStr(str, si+1, si+2, count);
        }
        ei++;
        countSubStr(str, si, ei, count);
    }
    public static void main(String[] args) {
        String str = "aba";
        countSubStr(str, 0, 1, 0);
    }
}
