package main.java.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/26
 */
public class Solution594 {
    
    public int findLHS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        int sum;
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                sum = map.get(num) + map.get(num + 1);
                if (sum > result) {
                    result = sum;
                }
            }
        }
        return result;
    }
    
}
