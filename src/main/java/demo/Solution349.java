package main.java.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * 349给定两个数组，写一个函数来计算它们的交集。
 * 例：给定nums1 = [1,2,2,1]，nums2 = [2,2]，return [2]。
 * 注意：
 * 结果中的每个元素必须是唯一的。
 * 结果可以是任何顺序。
 * @author hbh
 *
 */
public class Solution349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1.length == 0 || nums2.length == 0)
			return new int[0];
		Set<Integer> nums3 = new HashSet<Integer>();
		for(int i : nums1)
			nums3.add(i);
		Set<Integer> nums4 = new HashSet<Integer>();
		for(int j : nums2)
			if(nums3.remove(j))
				nums4.add(j);
		int length = nums4.size() ;
		int[] result = new int [length];
		for(int k : nums4)
			result[--length] = k;
        return result;
    }
	
	public int[] intersection1(int[] nums1, int[] nums2) {
		if(nums1.length == 0 | nums2.length == 0)
			return new int[0];
		int[] sum = new int[1024];
		
		for(int i : nums1) {
			sum[i] = 1;
		}
		int[] falg = new int[1024];
		int index = 0;
		for(int j :nums2) {
			if(sum[j] == 1) {
				sum[j] = 0;
				falg[index++] = j;
			}
		}
		int[] result = new int[index];
		for(int k : falg){
			if(index == 0)
				break;
			result[--index] = k;
		}
        return result;
    }
	
}
