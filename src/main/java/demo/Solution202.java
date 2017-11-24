package main.java.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/24
 */
public class Solution202 {
    
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = helper(n);
        while (sum != 1) {
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            sum = helper(sum);
        }
        return true;
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
