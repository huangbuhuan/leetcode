package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/7
 */
public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        while (n > 0) {
            if (n % 2 == (n /2)%2) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }
    
}
