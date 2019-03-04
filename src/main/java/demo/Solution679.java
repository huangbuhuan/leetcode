package main.java.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ${description}
 *
 * @author hbh
 * @date
 */
public class Solution679 {

    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<>();
        for (int num : nums) list.add((double) num);
        return solve(list);
    }

    private boolean solve(List<Double> nums) {
        if (nums.size() == 0) return false;
        if (nums.size() == 1) return Math.abs(nums.get(0) - 24.0) < 1e-6;
        return false;
    }

}
