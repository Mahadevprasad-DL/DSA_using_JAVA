class Solution {
    public static void main(String[] ars){
        int prices[] = {7,1,5,3,6,4};
        Solution sl= new Solution();
        System.out.println(sl.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int max_Profit=0;
    for(int i =0; i<n-1; i++){
        if( prices[i] < prices[i+1])
        {
            max_Profit+=prices[i+1]-prices[i];
        }
    }
        return max_Profit;
    }
}