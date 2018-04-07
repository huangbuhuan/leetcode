package main.java.demo;

import java.util.LinkedList;
import java.util.List;

public class Solution94 {

	private List<Integer> result = new LinkedList<>();
	private int index = 0;

	public List<Integer> inorderTraversal(TreeNode root) {
		add(result, index, root);
		return result;
	}

	public void add(List<Integer> result, int index, TreeNode root) {
		if (root == null) {
			return;
		}
		result.add(index, root.val);
		if (root.right != null) {
			add(result, index + 1, root.right);
		}
		if (root.left != null) {
			add(result, index, root.left);
		}
	}

}
