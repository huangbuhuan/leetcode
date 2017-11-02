package main.java.demo;
/**
 * 给定两个字符串s和t，写一个函数来确定t是否是s的顺序大论组成的字符串
 * 例如，
 * s =“anagram”，t =“nagaram”，返回true。
 * s =“rat”，t =“car”，return false。
 * @author hbh
 *
 */
public class Solution242 {
	public boolean isAnagram(String s, String t) {
		int[] nums = new int[123];
		for (char m : s.toCharArray()) {
			nums[m]++;
		}
		for (char r : t.toCharArray()) {
			if(--nums[r] == -1){
				return false;
			}
		}
		for (int i : nums) {
			if(i != 0)
				return false;
		}
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution242().isAnagram("ab", "a"));
	}
}
