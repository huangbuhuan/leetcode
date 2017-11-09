package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/9
 */
public class Solution226 {
    
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
