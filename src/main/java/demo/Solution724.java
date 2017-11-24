package main.java.demo;


/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/24
 */
public class Solution724 {
    
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum - nums[0] == 0) {
            return 0;
        }
        int tmp = 0;
        for (int i = 1; i < nums.length; i++) {
            tmp += nums[i - 1];
            if (tmp == ((sum - nums[i]) / 2.0)) {
                return i;
            }
        }
        return -1;
    }
    
    
}
