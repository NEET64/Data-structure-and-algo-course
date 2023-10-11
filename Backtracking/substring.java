package Backtracking;

public class substring {
    public static void findsub(String s,String ans, int i) {
        if(i >= s.length()){
            if(ans.equals("")){
                System.out.println("null");
            }else System.out.println(ans);
            return;
        }
        findsub(s, ans+s.charAt(i), i+1);
        findsub(s, ans, i+1);
    }
    
    public static void main(String[] args) {
        String str = "abc";

        findsub(str, "", 0);
    }
}
