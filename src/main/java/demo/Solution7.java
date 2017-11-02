package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/2
 */
public class Solution7 {
    
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        } else if (x > 0) {
            int k = x % 10;
            while ((x /= 10) > 0) {
                k = k * 10 + x % 10;
            }
            return k;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution7().reverse(123));
    }
    
}
