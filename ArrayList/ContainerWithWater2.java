package ArrayList;

import java.util.ArrayList;

public class ContainerWithWater2 {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int maxArea = Integer.MIN_VALUE;

        int lp=0, rp=height.size()-1;

        while(lp<rp){
            int minHeight = Integer.min(height.get(lp), height.get(rp));
            maxArea = Integer.max(maxArea, minHeight*(rp-lp));
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else rp--;
        }
        System.out.println(maxArea);
        
    }
}
