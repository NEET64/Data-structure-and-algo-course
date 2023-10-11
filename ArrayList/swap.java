package ArrayList;

import java.util.ArrayList;

public class swap {
    public static void swapIt(ArrayList<Integer> list, int n, int m) {
        int t = list.get(n);
        list.set(n, list.get(m));
        list.set(m, t);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        swapIt(list, 0, 3);
        System.out.println(list);

    }
}
