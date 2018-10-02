package main.java.demo;

import javax.crypto.MacSpi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 890题
 * @author huangbuhuan
 * @date 2018/10/2
 */
public class Solution890 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (match(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int j = 0; j < word.length(); j++) {
            char p = pattern.charAt(j);
            char w = word.charAt(j);
            if (!map1.containsKey(p)) map1.put(p, w);
            if (!map2.containsKey(w)) map2.put(w, p);

            if (map1.get(p) != w || map2.get(w) != p) {
                return false;
            }
        }
        return true;
    }

}
