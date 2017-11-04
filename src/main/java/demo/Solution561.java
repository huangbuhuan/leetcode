package main.java.demo;

import java.util.Arrays;

/**
 * 第561题
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/4
 */
public class Solution561 {
    
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    
}
