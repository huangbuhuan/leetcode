package main.java.demo;

import java.util.Arrays;
/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/13
 */
public class Solution453 {
    
    public int minMoves(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int minMoves = 0;
        Arrays.sort(nums);
        for (int i  = 1; i < nums.length; i++) {
            minMoves += nums[i] - nums[0];
        }
        return minMoves;
    }
    
}
