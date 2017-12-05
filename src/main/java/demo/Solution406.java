package main.java.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/5
 */
public class Solution406 {
	
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) -> {
			if (a[0] != b[0]) {
				return b[0] - a[0];
			} else {
				return a[1] - b[1];
			}
		});
		List<int[]> result = new LinkedList<>();
		for (int[] p : people) {
			result.add(p[1], p);
		}
		return result.toArray(new int[people.length][]);
	}
	
}
