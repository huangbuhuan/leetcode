package main.java.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * 217.给定一个整数数组，找到该数组是否包含任何重复。 如果任何值在数组中至少出现两次，
 * 则函数应返回true，如果每个元素都不同，则函数应返回false。
 * @author hbh
 */
public class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		final int length = nums.length;
        if(length == 0 || length == 1)
        	return false;
        Set<Integer> numSet = new HashSet<Integer>();
		for (int i = 0; i < length; i++) {
			if(numSet.contains(nums[i]))
				return true;
			numSet.add(nums[i]);
		}
        return false;
    }
}
