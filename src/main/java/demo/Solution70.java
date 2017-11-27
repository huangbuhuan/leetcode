package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/27
 */
public class Solution70 {
    
    public int climbStairs(int n) {
        int one = 0;
        int two = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
    
}
