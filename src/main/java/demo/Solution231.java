package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/28
 */
public class Solution231 {
    
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }
    
}
