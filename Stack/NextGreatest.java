package Stack;

import java.util.Stack;

public class NextGreatest {
    public static void main(String[] args) {
        int ar[] = {6,8,0,1,3};
        int nextG[] = new int[ar.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = ar.length-1; i >= 0; i--) {
            while(!stack.empty() && ar[stack.peek()] <= ar[i]){
                stack.pop();
            } 
            if(stack.empty()){
                nextG[i] = -1;
                stack.push(i);
                continue;
            }

            nextG[i] = ar[stack.peek()];
            stack.push(i);
        } 

        for (int i = 0; i < nextG.length; i++) {
            System.out.print(nextG[i]+" ");
        }
    }
}
