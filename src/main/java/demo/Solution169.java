package main.java.demo;

import java.util.HashMap;
import java.util.Map;


/**
 * 169.给定一个大小为n的数组，找到多数元素。 多数元素是出现超过⌊n / 2⌋倍的元素。
 * 你可以假定数组非空，且多数元素始终存在于数组中。
 * @author hbh
 *
 */
public class Solution169 {
	public int majorityElement(int[] nums) {
		if(nums.length == 1)
			return nums[0];
		final int n = nums.length/2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			Integer value = map.get(nums[i]);
			map.put(nums[i], value == null ? 1 : ++value);
			if (value!= null && value > n)
				return nums[i];
		}
        return -1;
    }
	
}
