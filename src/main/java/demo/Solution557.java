package main.java.demo;

/**
 * 第557题
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/4
 */
public class Solution557 {
    
    public String reverseWords(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
            }
            
        }
        reverse(chars, start, chars.length - 1);
        return new String(chars);
    }
    
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
    
}
