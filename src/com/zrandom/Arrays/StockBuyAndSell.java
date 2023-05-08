package com.zrandom.Arrays;

public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++){
            mini = Integer.min(mini, prices[i]);
            profit = Integer.max(profit,prices[i] - mini);
        }
        return profit;
    }
}
