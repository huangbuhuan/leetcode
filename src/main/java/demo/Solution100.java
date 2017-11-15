package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/15
 */
public class Solution100 {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            } else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
        return p == null && q == null;
    }
    
}
