package main.java.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution697 {
    
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);
            left.putIfAbsent(num, i);
            right.put(num, i);
        }
        int result = 50000;
        int max = Collections.max(count.values());
        for (Integer num : count.keySet()) {
            if (count.get(num) == max) {
                result = Math.min(right.get(num) - left.get(num) + 1, result);
            }
        }
        return result;
    }
    
}
