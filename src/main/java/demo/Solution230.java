package main.java.demo;

import java.util.LinkedList;
import java.util.List;

public class Solution230 {

	private List<Integer> tree = new LinkedList<>();

	public int kthSmallest(TreeNode root, int k) {
		parse(root, 0);
		return tree.get(k - 1);
	}

	private void parse(TreeNode root, int index) {
		if (root == null) {
			return;
		}

		tree.add(index, root.val);
		if (root.right != null) {
			parse(root.right, index);
		}
		if (root.left != null) {
			parse(root.left, index);
		}
	}
}
