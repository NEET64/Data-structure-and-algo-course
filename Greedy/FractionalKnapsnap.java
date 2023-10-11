import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsnap {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wei[] = {10, 20, 30};
        int W = 50;

        System.out.println(frationalKnapsnap(val, wei, W));
    }

    private static double frationalKnapsnap(int[] val, int[] wei, int w) {
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wei[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double value = 0d;
        int curW = w;

        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if(curW > wei[idx]){
                curW -= wei[idx];
                value += val[idx]; 
            }else{
                value += curW * (val[idx] / (double) wei[idx]);
            }
        }

        return value;
    }
}

// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article