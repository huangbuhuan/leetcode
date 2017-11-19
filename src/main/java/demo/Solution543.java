package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/19
 */
public class Solution543 {
    
    private int result = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        dep(root);
        return result;
    }
    
    private int dep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dep(root.left);
        int right = dep(root.right);
        result = Math.max(result, left + right);
        return Math.max(left, right) + 1;
    }
    
}
