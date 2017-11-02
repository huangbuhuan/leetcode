package main.java.demo;

/**
 * 给定一个任意的赎金注释字符串和包含所有杂志的字母的另一个字符串，编写一个函数，如果可以从杂志构建赎金注释，则该函数将返回true; 否则，它将返回false。
 * 杂志字符串中的每个字母只能在您的赎金备注中使用一次。
 * @author hbh
 *
 */
public class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] nums = new int[1024];
		for (char m : magazine.toCharArray())
			nums[m]++;
		for (char r : ransomNote.toCharArray())
			if(--nums[r] == -1)
				return false;
		return true;
    }
}
