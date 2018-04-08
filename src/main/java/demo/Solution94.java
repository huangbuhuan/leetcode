package main.java.demo;

import java.util.LinkedList;
import java.util.List;

public class Solution94 {

	private List<Integer> result = new LinkedList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		add(0, root);
		return result;
	}

	public void add(int index, TreeNode root) {
		if (root == null) {
			return;
		}
		result.add(index, root.val);
		if (root.right != null) {
			add(index + 1, root.right);
		}
		if (root.left != null) {
			add(index, root.left);
		}
	}

}
