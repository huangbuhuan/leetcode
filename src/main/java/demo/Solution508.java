package main.java.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/26
 */
public class Solution508 {
    
    private Map<Integer, Integer> map = new HashMap<>();
    private int maxCount = 0;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> maxCounts = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (maxCount ==  map.get(key)) {
                maxCounts.add(key);
            }
        }
        int[] result = new int[maxCounts.size()];
        for (int i = 0; i < maxCounts.size(); i++) {
            result[i] = maxCounts.get(i);
        }
        return result;
    }
    
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftVal = dfs(root.left);
        int rightVal = dfs(root.right);
        int sum = root.val + leftVal + rightVal;
        Integer count = map.getOrDefault(sum, 0) + 1;
        maxCount = count > maxCount ? count : maxCount;
        map.put(sum, count);
        return sum;
    }
    
}
