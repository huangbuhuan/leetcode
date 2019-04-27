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

		List<Integer> keys = rooms.get(0);
		rooms.set(0, new ArrayList<>());
		keys.forEach(it -> find(rooms, it));
		for (List<Integer> room : rooms) {
			if (room.size() != 0) {
				return false;
			}
		}
		return true;
	}

	private void find(List<List<Integer>> rooms, Integer key) {
		List<Integer> keys = rooms.get(key);
		if (keys.size() == 0) {
			return;
		}
		rooms.set(key, new ArrayList<>());

		keys.forEach(it -> find(rooms, it));
	}

}
