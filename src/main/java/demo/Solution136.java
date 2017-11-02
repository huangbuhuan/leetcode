package main.java.demo;


/**
 * 第136题.给定一个整数数组，每一个元素都会出现两次，除了一个。找到那个单的。
 * @author hbh
 *
 */
public class Solution136 {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i = 0, length = nums.length; i < length; i++)
			result ^= nums[i];
        return result;
    }
}
