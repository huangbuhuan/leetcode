package main.java.demo;

import java.util.Arrays;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/27
 */
public class Solution462 {
    
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int num = nums[nums.length/2];
        int result = 0;
        for (int i : nums) {
            result += Math.abs(i - num);
        }
        return result;
    }
}
