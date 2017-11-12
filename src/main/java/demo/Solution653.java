package main.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
    
    public void inOrder(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        inOrder(treeNode.left, list);
        list.add(treeNode.val);
        inOrder(treeNode.right, list);
    }
    
}
