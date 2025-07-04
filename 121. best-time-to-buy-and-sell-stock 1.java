//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, small = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(small > prices[i]){
                small = prices[i];
            }
            else if(prices[i]-small > profit){
                profit = prices[i]-small;
            }
        }
        return profit;
    }
}