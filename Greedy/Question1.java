public class Question1 {
    public static int balanceCount(String s) {
        int count=0;
        int i=0;
        for(char c : s.toCharArray()){
            if(c == 'R') i++;
            else i--;
            if(i==0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // String s = "RLRRLLRLRL";
        String s = "RLRRRLLRLL";

        System.out.println(balanceCount(s));
    }
}

// https://leetcode.com/problems/split-a-string-in-balanced-strings/