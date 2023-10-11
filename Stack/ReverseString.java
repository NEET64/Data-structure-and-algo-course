package Stack;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String S = "abcd";
        Stack<Character> st = new Stack<>();
        for(int i=0; i<S.length(); i++){
            st.push(S.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder("");
        while(!st.empty()){
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
    }
}
