package com.kan01234.leet.code.java.q104;

import com.kan01234.leet.code.java.common.model.TreeNode;

class Solution {

	public int maxDepth(TreeNode root) {
		return maxDepth(root, 0);
	}

	private int maxDepth(TreeNode node, int count) {
		if (node == null)
			return count;
		count += 1;
		return Math.max(maxDepth(node.left, count), maxDepth(node.right, count));
	}

}
