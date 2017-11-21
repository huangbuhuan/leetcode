package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/21
 */
public class Solution674 {
    
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int longest = 1;
        int tmp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                if (++tmp > longest) {
                    longest = tmp;
                }
            } else {
                tmp = 1;
            }
        }
        return longest;
    }
    
}
