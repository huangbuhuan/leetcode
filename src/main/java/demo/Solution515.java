package main.java.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
public class Solution515 {
	
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			TreeNode tmp = queue.element();
			int max = tmp.val;
			while (size-- != 0) {
				tmp = queue.poll();
				if (tmp.val > max) {
					max = tmp.val;
				}
				if (tmp.left != null) {
					queue.add(tmp.left);
				}
				if (tmp.right != null) {
					queue.add(tmp.right);
				}
			}
			result.add(max);
		}
		return result;
	}
}
