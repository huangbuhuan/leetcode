package main.java.demo;

import java.util.Arrays;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/23
 */
public class Solution628 {
    
    public int maximumProduct(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int a = nums[length - 1] * nums[length - 2] * nums[length -3];
        int b = 0;
        if (nums[0] < 0 && nums[1] < 0) {
            b = nums[0] * nums[1] * nums[length - 1];
        }
        return a > b ? a : b;
    }
    
}
