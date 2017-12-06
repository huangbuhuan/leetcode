package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/6
 */
public class Solution540 {
    
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
