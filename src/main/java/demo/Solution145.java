package main.java.demo;

import java.util.LinkedList;
import java.util.List;

public class Solution145 {

	private List<Integer> result = new LinkedList<>();

	public List<Integer> postorderTraversal(TreeNode root) {
		parse(root, 0);
		return result;
	}

	private void parse(TreeNode root, int index) {
		if (root == null) {
			return;
		}

		result.add(index, root.val);
		if (root.right != null) {
			parse(root.right, index);
		}
		if (root.left != null) {
			parse(root.left, index);
		}
	}

}
