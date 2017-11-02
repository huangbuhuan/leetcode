package main.java.demo;

/**
 * 第344题
 * @author hbh
 *
 */
public class Solution344 {
	public String reverseString(String s) {
		char[] chars = s.toCharArray();
		final int j = chars.length -1;
		final int k = chars.length/2;
		for(int i = 0; i < k; i++){
			char c = chars[i];
			chars[i] = chars[j - i];
			chars[j - i] = c;
		}
        return String.valueOf(chars);
    }
	
}
