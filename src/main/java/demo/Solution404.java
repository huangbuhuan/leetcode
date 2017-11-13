package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/13
 */
public class Solution404 {
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sumOfLeftLeaves = 0;
        TreeNode leftNode = root.left;
        if (leftNode != null && leftNode.left == null && leftNode.right == null) {
            sumOfLeftLeaves += leftNode.val;
        }
        sumOfLeftLeaves += sumOfLeftLeaves(leftNode) + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves;
    }
    
}
