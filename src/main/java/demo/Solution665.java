package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/6
 */
public class Solution665 {
    
    public boolean checkPossibility(int[] nums) {
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if(flag) return false;
                else {
                    if(i-2>=0 && nums[i]<nums[i-2]) nums[i] = nums[i-1];
                    flag = true;
                }
            }
        }
        return true;
    }
    
}
