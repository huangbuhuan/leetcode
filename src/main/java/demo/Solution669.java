package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution669 {
    
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left = trimBST(root.left, L, R);
        }
        if (root.right != null) {
            root.right = trimBST(root.right, L, R);
        }
        if (root.val < L) {
            root = root.right;
        } else if (root.val > R) {
            root = root.left;
        }
        
        return root;
    }
    
}
