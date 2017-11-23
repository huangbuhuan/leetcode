package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/23
 */
public class Solution671 {
    
    private int smallest = Integer.MAX_VALUE;
    private int secondMin = Integer.MAX_VALUE;
    
    public int findSecondMinimumValue(TreeNode root) {
        find(root);
        return secondMin != Integer.MAX_VALUE ? secondMin : -1;
    }
    
    private void find(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.val < smallest) {
            smallest = root.val;
        } else if (root.val != smallest && root.val < secondMin) {
            secondMin = root.val;
        }
        find(root.left);
        find(root.right);
    }
    
}
