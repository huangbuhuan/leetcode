package main.java.demo;

/**
 * 283.给定一个数组nums，写一个函数将所有0放到其他数的后面
 * 例如，输入= [ 0，1，0，3，12 ]输出[ 1，3，12，0，0 ]。
 * @author hbh
 *
 */
public class Solution283 {
	public void moveZeroes(int[] nums) {
		final int length = nums.length;
		int index = 0;
		for(int i = 0; i < length; i++)
			if(0 != nums[i])
				nums[index++] = nums[i];
		for(int j = index; j < length; j++ )
			nums[j] = 0;
	}

}
