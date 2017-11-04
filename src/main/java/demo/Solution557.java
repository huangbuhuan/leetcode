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
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (int i = 0, length = strings.length; i < length; i++) {
            
            for (int j = strings[i].length() - 1; j >= 0 ; j--) {
                str += strings[i].charAt(j);
            }
            if (i == length - 1) {
                sb.append(str);
            } else {
                sb.append(str).append(" ");
            }
            
            str = "";
            
        }
        return sb.toString();
    }
    
}
