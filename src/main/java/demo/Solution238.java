package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/30
 */
public class Solution238 {
    
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i -1] * nums[i - 1];
        }
        int tmp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * tmp;
            tmp *= nums[i];
        }
        return result;
    }
    
}
