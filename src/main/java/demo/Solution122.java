package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/13
 */
public class Solution122 {
    
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
}
