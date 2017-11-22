package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/22
 */
public class Solution121 {
    
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int min = prices[0];
        int tmp;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                tmp = prices[i] - min;
                if (tmp > maxProfit) {
                    maxProfit = tmp;
                }
            }
        }
        return maxProfit;
    }
    
}
