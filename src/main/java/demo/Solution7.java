package main.java.demo;

/**
 * 第七题 考虑越界和为0的情况
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/2
 */
public class Solution7 {
    
    public int reverse(int x) {
        int y = 0;
        int n;
        while (x != 0) {
            n = x%10;
            if (y > Integer.MAX_VALUE/10 || y < Integer.MIN_VALUE/10 ) {
                return 0;
            }
            y = y*10 +n;
            x /=10;
        }
        return y;
    }
    
}
