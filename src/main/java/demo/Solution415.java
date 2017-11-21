package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/21
 */
public class Solution415 {
    
    public String addStrings(String num1, String num2) {
        if (num1.length() == 0) {
            return num2;
        } else if (num2.length() == 0) {
            return num1;
        }
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        for (;i >= 0 || j >= 0 || add > 0;) {
            int cur = add;
            cur += i >= 0 ? num1.charAt(i--) - '0' : 0;
            cur += j >= 0 ? num2.charAt(j--) - '0' : 0;
            add = cur / 10;
            cur %= 10;
            sb.append((char)('0'+ cur));
        }
        
        return sb.reverse().toString();
    }
    
}
