package main.java.demo;

/**
 * @author hbh
 * @date 2019-08-04
 */
public class Solution979 {

    int result = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root)
        return result;
    }

    public int dfs(TreeNode treeNode) {
        if (treeNode == null) return 0;

        int l = dfs(treeNode.left);
        int r = dfs(treeNode.right);

        result += Math.abs(l + r + treeNode.val - 1);

        return l + r + treeNode.val - 1;
    }

}
