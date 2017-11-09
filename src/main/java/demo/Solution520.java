package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/9
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if ("USA".equals(word)) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 90) {
                count++;
            }
        }
        if (count == word.length() || count ==0) {
            return true;
        } else if (count == 1 && word.charAt(0) <= 90) {
            return true;
        }
        return false;
    }
}
