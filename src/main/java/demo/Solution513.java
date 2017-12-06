package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/6
 */
public class Solution513 {
    
    private int result = -1;
    private int dep = 1;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 1);
        return result;
    }
    
    private void helper(TreeNode root, int index) {
        if (root == null) {
            return;
        }
        if (index >= dep) {
            dep = index;
            result = root.val;
        }
        
        helper(root.right, index + 1);
        helper(root.left, index + 1);
    }
    
}
