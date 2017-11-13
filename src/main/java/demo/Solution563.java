package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/13
 */
public class Solution563 {
    
    int tilt = 0;
    
    public int findTilt(TreeNode root) {
        helper(root);
        return tilt;
    }
    
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = helper(root.left);
        int rightSum = helper(root.right);
        tilt += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
    
}
