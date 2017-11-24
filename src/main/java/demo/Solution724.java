package main.java.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/24
 */
public class Solution724 {
    
    public int pivotIndex(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = helper()
        return 1;
    }
    
    private int helper(int n) {
        int tmp = 0;
        int a;
        while (n > 0) {
            a = n % 10;
            n /= 10;
            tmp += (a * a);
        }
        return tmp;
    }
    
}
