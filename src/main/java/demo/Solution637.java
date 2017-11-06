package main.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/6
 */
public class Solution637 {
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        average(root, 0, result, count);
        for (int i = 0; i < count.size(); i++) {
            result.set(i, result.get(i) / count.get(i));
        }
        return result;
    }
    
    private void average(TreeNode t, int i, List<Double> r, List<Integer> count) {
        if (t == null) {
            return;
        }
        if (i < r.size()) {
            r.set(i, r.get(i) + t.val);
            count.set(i, count.get(i) + 1);
        } else {
            r.add(t.val * 1.0);
            count.add(1);
        }
        average(t.left, i + 1, r, count);
        average(t.right, i + 1, r, count);
    }
    
}
