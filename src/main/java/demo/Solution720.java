package main.java.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/26
 */
public class Solution720 {
    
    public String longestWord(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        String result = "";
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        for (String word : words) {
            if (word.length() > result.length() || word.length() == result.length() &&
                word.compareTo(result) < 0) {
                boolean flag = true;
                for (int k = 1; k < word.length(); k++) {
                    if (!wordSet.contains(word.substring(0, k))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result = word;
                }
            }
        }
        return result;
    }
    
}
