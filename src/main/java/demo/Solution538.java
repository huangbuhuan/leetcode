package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution538 {
    
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        return root;
    }
    
    private void add(TreeNode root) {
        if (root == null) {
            return;
        }
        add(root.right);
        root.val += sum;
        sum = root.val;
        add(root.left);
    }
    
}
