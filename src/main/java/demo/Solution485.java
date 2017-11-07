package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/7
 */
public class Solution485 {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tmp++;
                if (tmp >= result) {
                    result = tmp;
                }
            } else {
                tmp = 0;
            }
        }
        return result;
    }
    
}
