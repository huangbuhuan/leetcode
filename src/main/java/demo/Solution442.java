package main.java.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/4
 */
public class Solution442 {
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}
