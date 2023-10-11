import java.util.ArrayList;

public class IndianCoin {
    public static void main(String[] args) {
        System.out.println(coins(159));
    }

    private static ArrayList<Integer> coins(int N) {
        ArrayList<Integer> list = new ArrayList<>();

        int ar[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int i=ar.length-1;
        while(N>0){
            if(N >= ar[i] && i>=0){
                N -= ar[i];
                list.add(ar[i]);
            }else i--;
        }
        return list;
    }
}


//this question here only works for canonical coin systems
//https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
