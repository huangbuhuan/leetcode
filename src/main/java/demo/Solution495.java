package main.java.demo;

/**
 * @author hbh
 * @date 2019-04-27
 */
public class Solution495 {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		if (timeSeries.length == 0) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < timeSeries.length - 1; i++) {
			if (timeSeries[i + 1] - timeSeries[i] < duration) {
				result += timeSeries[i + 1] - timeSeries[i];
			} else {
				result += duration;
			}
		}

		result += duration;
		return result;
	}

}
