package com.dieg0407.slidingwindow;

public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int prev = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prev > prices[i]) {
                prev = prices[i];
                continue;
            }

            max = Math.max(max, prices[i] - prev);
        }
        return max;
    }
}
