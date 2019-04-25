package main.java.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hbh
 * @date 2019-04-25
 */
public class Solution884 {

	public String[] uncommonFromSentences(String A, String B) {
		Set<String> s3 = new HashSet<>();
		Set<String> result = new HashSet<>();
		String[] s1 = A.split(" ");
		for (String s : s1) {
			if (s3.contains(s)) {
				result.remove(s);
			} else {
				result.add(s);
				s3.add(s);
			}
		}
		String[] s2 = B.split(" ");
		for (String s : s2) {
			if (s3.contains(s)) {
				result.remove(s);
			} else {
				result.add(s);
				s3.add(s);
			}
		}

		String[] s = new String[result.size()];
		return result.toArray(s);
	}
}
