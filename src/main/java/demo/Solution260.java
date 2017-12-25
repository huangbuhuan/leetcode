package main.java.demo;

import java.util.*;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/25
 */
public class Solution260 {
    
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.get(num);
            if (value != null) {
                map.put(num, ++value);
            } else {
                map.put(num, 1);
            }
        }
        int[] result = new int[2];
        int tmp = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                result[tmp++] = key;
            }
        }
        
        return result;
    }
    
}
