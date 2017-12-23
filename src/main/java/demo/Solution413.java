package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/23
 */
public class Solution413 {
	
	public int numberOfArithmeticSlices(int[] A) {
		int count = 0;
		int result = 0;
		for (int i = 0; i < A.length - 2; i ++) {
			if (A[i] + A[i + 2] == 2 * A[i + 1]) {
				count++;
			} else {
				if (count > 0) {
					result += (1 + count) * count / 2;
				}
				count = 0;
			}
		}
		if (count > 0) {
			result += (1 + count) * count / 2;
		}
		return result;
	}
	
}
