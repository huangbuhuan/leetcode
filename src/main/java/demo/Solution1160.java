package main.java.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author hbh
 * @date 2020-03-17
 */
public class Solution1160 {
	public int countCharacters(String[] words, String chars) {
		int result = 0;
		int[] charsCount = count(chars);
		for (String word : words) {
			int[] wordsCount = count(word);

			if (contains(charsCount, wordsCount)) {
				result += word.length();
			}
		}
		return result;
	}

	private boolean contains(int[] charCount, int[] wordCount) {
		for (int i = 0; i < 26; i++) {
			if (charCount[i] < wordCount[i]) {
				return false;
			}
		}
		return true;
	}

	private int[] count(String word) {
		int[] result = new int[26];
		char[] chars = word.toCharArray();
		for (char c : chars) {
			result[c - 'a']++;
		}
		return result;
	}

}
