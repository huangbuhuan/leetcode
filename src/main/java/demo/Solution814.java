package main.java.demo;

public class Solution814 {

	public TreeNode pruneTree(TreeNode root) {
		return containsOne(root) ? root : null;
	}

	private boolean containsOne(TreeNode root) {
		if (root == null) {
			return false;
		}
		boolean a1 = containsOne(root.left);
		boolean a2 = containsOne(root.right);
		if (!a1) {
			root.left = null;
		}
		if (!a2) {
			root.right = null;
		}
		return root.val == 1 || a1 || a2;
	}
}
