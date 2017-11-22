package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/22
 */
public class Solution108 {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return builder(nums, 0, nums.length - 1);
    }
    
    private TreeNode builder(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int tmp = (left + right) / 2;
        TreeNode root = new TreeNode(nums[tmp]);
        root.left = builder(nums, left, tmp -1);
        root.right = builder(nums, tmp + 1, right);
        return root;
    }
    
}
