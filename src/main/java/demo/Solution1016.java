package main.java.demo;

/**
 * @author hbh
 * @date 2019/8/14
 */
public class Solution1016 {
	public boolean queryString(String S, int N) {
		for (int i = 1; i <= N; i++) {
			if (!S.contains(Integer.toBinaryString(i))) {
				return false;
			}
		}
		return true;
	}
}
