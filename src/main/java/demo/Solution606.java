package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution606 {
    
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        String a = t.val + "";
        if (t.left != null || t.right != null) {
            a += "(" + tree2str(t.left) + ")";
        }
        if (t.right != null) {
            a += "(" + tree2str(t.right) + ")";
        }
        return a;
    }
    
}
