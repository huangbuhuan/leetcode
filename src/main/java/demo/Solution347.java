package main.java.demo;

import java.util.*;

public class Solution347 {

	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			int value = map.getOrDefault(num, 0);
			map.put(num, ++value);
		}
		List[] bucket = new List[nums.length + 1];
		for (Integer key : map.keySet()) {
			int count = map.get(key);
			if (bucket[count] == null) {
				bucket[count] = new ArrayList<>();
			}
			bucket[count].add(key);
		}
		List<Integer> result = new ArrayList<>();
		for (int i = bucket.length - 1; result.size() < k; i--) {
			if (bucket[i] != null) {
				result.addAll(bucket[i]);
			}
		}
		return result;
	}

}
