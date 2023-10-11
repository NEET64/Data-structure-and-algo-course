package Arrays;

public class stocks {
    public static void main(String[] args) {
        int prices[] = {7,5,4,3,2,1};
        int buyDay = 0; 
        int sellDay = 0;
        int profit[] = new int[prices.length];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[buyDay] > prices[i]){
                buyDay = i;
            }
            sellDay = i;
            profit[i] = prices[sellDay] - prices[buyDay];
        }
        for (int i = 0; i < profit.length; i++) {
            maxProfit = Math.max(profit[i], maxProfit);
        }
        System.out.println("max profit: "+maxProfit+", if you sell on day "+sellDay);
    }
}
