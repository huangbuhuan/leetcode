package main.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/30
 */
public class Solution257 {
    
    private List<String> result = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return result;
        }
        helper(root, String.valueOf(root.val));
        return result;
    }
    
    private void helper(TreeNode root, String s) {
        if (root.left == null && root.right == null) {
            result.add(s);
            return;
        }
        if (root.left != null) {
            helper(root.left, s + "->" + root.left.val);
        }
        if(root.right != null) {
            helper(root.right, s + "->" + root.right.val);
        }
    }
}
