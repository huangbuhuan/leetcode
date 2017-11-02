package main.java.demo;

/**
 * 给定两个字符串s和t，其中包括唯一的小写字母。
 * 字符串t是由随机混合的字符串s生成的，然后在一个随机位置添加一个字母。
 * 找到在t中添加的字母。
 * @author\
 * 'a'-'z' ：97-122
 */
public class Solution389 {
	public char findTheDifference(String s, String t) {
		final int[] a = new int[26];
		for(int i = 0; i < s.length(); i++)
			a[s.charAt(i)-97]++;
		for (int i = 0; i < t.length(); i++)
			a[t.charAt(i)-97]--;
		for (int i = 0; i < 26; i++)
			if(-1 == a[i])
				return (char)(i + 97);
		return ' ';
    }
	
}
