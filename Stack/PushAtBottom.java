package Stack;
import java.util.*;

public class PushAtBottom {
    public static void pushAtB(Stack<Integer> st, int n){
        while(st.empty()){
            st.push(n);
            return;
        }

        int x = st.pop();
        pushAtB(st, n);
        st.push(x);
    }

    public static void print(Stack<Integer> st) {
        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);

        pushAtB(st, 0);
        print(st);
    }
}
