package main.java.demo;

import java.util.HashSet;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/27
 */
public class Solution572 {
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s, t);
    }
    
    private boolean equals(TreeNode x, TreeNode y) {
        if (x == null && y == null) {
            return true;
        }
        if (x == null || y == null) {
            return false;
        }
        return x.val == y.val && equals(x.left, y.left) && equals(x.right, y.right);
    }
    
    private boolean traverse(TreeNode s, TreeNode t) {
        return s != null && (equals(s, t) || traverse(s.left, t) || traverse(s.right, t));
    }
    
}
