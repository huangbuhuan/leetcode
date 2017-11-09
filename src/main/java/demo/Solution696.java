package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/9
 */
public class Solution696 {
    
    public int countBinarySubstrings(String s) {
        int[] nums = new int[s.length()];
        int t = 0;
        nums[0] = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                nums[++t] = 1;
            } else {
                nums[t]++;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            count += Math.min(nums[i], nums[i + 1]);
        }
        return count;
    }
    
}
