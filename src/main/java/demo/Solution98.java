package main.java.demo;

public class Solution98 {

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, null, null);
	}

	private boolean isValidBST(TreeNode root, Integer min, Integer max) {
		if (root == null) {
			return true;
		}
		if ((min != null && root.val <= min) ||
			(max != null && root.val >= max)) {
			return false;
		}

		return isValidBST(root.left, min, root.val)
			&& isValidBST(root.right, root.val, max);
	}

}
