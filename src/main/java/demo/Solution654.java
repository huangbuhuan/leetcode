package main.java.demo;


/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/3
 */
public class Solution654 {
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length);
    }
    
    public TreeNode helper(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = start; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = helper(nums, start, index);
        root.right = helper(nums, index + 1, end);
        return root;
    }
    
}
