package main.java.demo;

import java.util.*;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/29
 */
public class Solution451 {
    
    public String frequencySort(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> item : list) {
            for (int i = 0, length = item.getValue(); i < length; i++) {
                result.append(item.getKey());
            }
        }
        return result.toString();
    }
}
