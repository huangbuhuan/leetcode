package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/20
 */
public class Solution35 {
    
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int pre = -1;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(pre);
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target) {
                pre = i;
            } else {
                return pre + 1;
            }
        }
        return nums.length;
    }
    
}
