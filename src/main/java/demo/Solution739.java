package main.java.demo;


/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/24
 */
public class Solution739 {
    
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}
