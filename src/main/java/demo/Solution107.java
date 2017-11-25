package main.java.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/25
 */
public class Solution107 {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        helper(root, 0);
        Collections.reverse(result);
        return result;
    }
    
    private void helper(TreeNode root, int index) {
        if (root == null) {
            return;
        }
        if (index == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(index).add(root.val);
        index++;
        helper(root.left, index);
        helper(root.right, index);
    }
    
}
