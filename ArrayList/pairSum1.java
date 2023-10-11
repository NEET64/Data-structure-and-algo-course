package ArrayList;

import java.util.ArrayList;

public class pairSum1 {
    public static void bruteForce(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(target == list.get(i) + list.get(j)){
                    System.out.println(i +" "+ j);
                    System.out.println(list.get(i)+" + "+list.get(j));
                    return;
                }
            }
        }
    }

    public static void TwoPointer(ArrayList<Integer> list, int target) {
        int lp=0, rp=list.size()-1;

        while(lp<rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum == target){
                System.out.println(lp +" "+ rp);
                System.out.println(list.get(lp)+" + "+list.get(rp));
            }else if(sum>target){
                lp++;
            }else rp--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        bruteForce(list, 6);
    }
}
