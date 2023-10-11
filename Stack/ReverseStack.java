package Stack;
import java.util.*;

public class ReverseStack {
    static void addToBottom(Stack<Integer> s, int k){
        if(s.empty()){
            s.push(k);
            return;
        }
        
        int x = s.pop();
        addToBottom(s, k);
        s.push(x);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.empty()) return;
        int x = s.pop();
        reverse(s);
        addToBottom(s, x);
    }

    public static void print(Stack<Integer> s) {
        while(!s.empty()){
            System.out.println(s.pop());

        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);
        System.out.println("now reverse");
        print(s);
    }

}
