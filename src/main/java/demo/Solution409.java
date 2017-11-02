package main.java.demo;

/**
 * 409.给定一个随机的字符串，找出能拼接出回数的最大值.有大小写要求
 * 出入abccccdd
 * 输出7
 * @author Administrator
 *
 */
public class Solution409 {
	
	public int longestPalindrome(String s) {
		int[] a = new int['z' + 1];
		for(char c : s.toCharArray()){
			a[c]++;
		}
		int sum = 0;
		for(int i = 'A'; i <= 'z' ; i++ ) {
			sum += a[i]/2;
		}
        return sum*2 == s.length() ? sum*2 : sum*2 + 1;
    }
}
