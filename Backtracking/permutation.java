package Backtracking;

public class permutation {
    public static void findPer(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            findPer(s.substring(0, i)+s.substring(i+1,s.length()), ans+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPer(str, "");
    }
}
