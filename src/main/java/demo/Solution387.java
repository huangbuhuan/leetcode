package main.java.demo;

/**
 * 387.给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。 如果不存在，则返回-1。
 * @author hbh
 *
 */
public class Solution387 {
	public int firstUniqChar(String s) {
		if (s.length() == 0)
			return -1;
		if(s.length() == 1)
			return 0;
		int[] a = new int[26];
        for(int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 'a']++;
        for(int i = 0; i < s.length(); i++)
            if(a[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
	}

}
