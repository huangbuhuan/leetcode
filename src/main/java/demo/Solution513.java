package main.java.demo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/6
 */
public class Solution513 {
    
    private int result = -1;
    private int dep = 1;
    
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = queue.size();
        int result = root.val;
        TreeNode tmp;
        while(size != 0) {
            size = queue.size();
            tmp = queue.element();
            result = tmp.val;
            while(size-- != 0) {
                tmp = queue.poll();
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
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
