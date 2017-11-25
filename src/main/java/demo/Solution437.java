package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/25
 */
public class Solution437 {
    
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int dfs(TreeNode root, int sum) {
        int result = 0;
        if (root == null) {
            return result;
        }
        if (sum == root.val) {
            result++;
        }
        result += dfs(root.left, sum - root.val);
        result += dfs(root.right, sum - root.val);
        return result;
    }
    
}
