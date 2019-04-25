package main.java.demo;

/**
 * @author hbh
 * @date 2019-04-25
 */
public class Solution1017 {
	public String baseNeg2(int N) {
		if (N == 0 || N == 1) {
			return String.valueOf(N);
		}

		return baseNeg2(-(N >> 1)) + (N & 1);
	}
}
