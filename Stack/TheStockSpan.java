package Stack;
import java.util.Stack;

public class TheStockSpan {
    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < stock.length; i++) {
            while(!stack.empty() && stock[stack.peek()] <= stock[i]){
                span[i] += span[stack.pop()];
            }
            span[i]++;
            stack.push(i);
        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}
