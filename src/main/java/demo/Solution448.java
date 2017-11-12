package main.java.demo;

import java.util.*;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution448 {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp = Math.abs(nums[i]) - 1;
            if (nums[tmp] > 0) {
                nums[tmp] = -nums[tmp];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
    
}
