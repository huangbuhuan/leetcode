package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution171 {
    
    public int titleToNumber(String s) {
        int result = 0;
        int length = s.length();
        int index = 1;
        for (int i = length - 1; i >= 0; i--) {
            if (i != length -1) {
                index *= 26;
            }
            result += (s.charAt(i) - 64) * index;
            System.out.println(result);
        }
        return result;
    }
    
}
