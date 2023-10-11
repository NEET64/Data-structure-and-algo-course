package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveTwoHalf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        
        System.out.println(q);
        Queue<Integer> q2 = new LinkedList<>();

        while(q2.size()<=(q.size()/2+1)){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
