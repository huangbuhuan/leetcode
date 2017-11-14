package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/14
 */
public class Solution530 {
    
    int min = Integer.MAX_VALUE;
    int pre = -1;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return min;
        }
        getMinimumDifference(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}
