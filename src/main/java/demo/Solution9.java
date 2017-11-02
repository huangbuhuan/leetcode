package main.java.demo;

/**
 * 第9题 判断是否为回文
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/2
 */
public class Solution9 {
    
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int result = 0;
        int origin = x;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return origin == result;
    }
    
}
