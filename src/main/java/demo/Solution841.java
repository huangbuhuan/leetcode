package main.java.demo;

import java.util.*;

/**
 * @author hbh
 * @date 2019-04-27
 */
public class Solution841 {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		if (rooms.size() == 0 || rooms.size() == 1) {
			return true;
		}
		boolean[] result = new boolean[rooms.size()];
		dfs(0, rooms, result);
		for (boolean i : result) {
			if (!i) {
				return false;
			}
		}
		return true;
	}

	private boolean dfs(int currRoom, List<List<Integer>> rooms, boolean[] result) {
		result[currRoom] = true;
		List<Integer> keys = rooms.get(currRoom);
		for (Integer key : keys) {
			if (!result[key] && !dfs(key, rooms, result)) {
				return false;
			}
		}
		return true;
	}
}
