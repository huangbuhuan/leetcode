package main.java.demo;

/**
 * @author hbh
 * @date 2019-04-25
 */
public class Solution1017 {
	public String baseNeg2(int N) {
		StringBuilder sb = new StringBuilder();

		while (N != 0) {
			sb.insert(0, (N & 1));

			N = -(N >> 1);
		}

		return sb.length() == 0 ? "0" : sb.toString();
	}
}
