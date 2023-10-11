package ArrayList;

import java.util.ArrayList;

public class pairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        int rp=0, lp=rp+1;
        while(list.get(rp)<list.get(lp)){
            rp++;
            lp++;
        }

        while(lp != rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum == target){
                System.out.println(lp +" "+ rp);
                System.out.println(list.get(lp)+" + "+list.get(rp));
                return;
            }else if(sum<target){
                lp = (lp+1)%(list.size());
            }else{
                rp = (list.size() + rp - 1)%list.size();
            } 
        }
        
        System.out.println("no match");

    }
}
