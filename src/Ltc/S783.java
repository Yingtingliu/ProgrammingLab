package Ltc;

import java.util.LinkedList;

public class S783 {

	public int minDiffInBST(TreeNode root) {
		int min = Integer.MAX_VALUE;
		if (root == null) {
			return -1;
		}
		if (root.left != null) {
			min = Math.min(min, root.val - root.left.val);
			min = Math.min(min, root.val - minDiffInBSTMax(root.left));
		}
		if (root.right != null) {
			min = Math.min(min, root.right.val - root.val);
			min = Math.min(min, minDiffInBSTMin(root.right) - root.val);
		}
		int leftMin = minDiffInBST(root.left);
		if (leftMin != -1) {
			min = Math.min(min, leftMin);
		}
		int rightMin = minDiffInBST(root.right);
		if (rightMin != -1) {
			min = Math.min(min, rightMin);
		}
		return min;
	}

	private int minDiffInBSTMin(TreeNode root) {
		while (root.left != null) {
			root = root.left;
		}
		return root.val;
	}

	private int minDiffInBSTMax(TreeNode root) {
		while (root.right != null) {
			root = root.right;
		}
		return root.val;
	}

}
