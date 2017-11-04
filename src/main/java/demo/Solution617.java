package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/3
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class Solution617 {
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        t1.val += t2.val;
        while (t1.left != null) {
            
        }
        return null;
    }
}
