package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/7
 */
public class Solution647 {
	
	public int countSubstrings(String s) {
	    int res = 0;
	    int length = s.length();
	    for (int i = 0; i< length; i++) {
	        for (int j = 0; i - j >= 0 && i + j < length && s.charAt(i - j) == s.charAt(i + j); j++) {
	            res ++;
            }
            for (int j = 0; i - 1 - j >= 0 && i + j < length && s.charAt(i - 1 - j) == s.charAt(i + j); j++) {
                res++;
            }
        }
		return res;
	}
}
