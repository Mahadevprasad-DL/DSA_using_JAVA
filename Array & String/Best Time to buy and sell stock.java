class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit =0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < buyprice){
                buyprice = prices[i];
            } else {
                int current_profit = prices[i]-buyprice;
                profit = Math.max(current_profit, profit);
            }
        }

        return profit;
        
    }
}
