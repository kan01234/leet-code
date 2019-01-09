package com.dotterbear.leet.code.maximum.depth.of.binary.tree;

import com.dotterbear.leet.code.common.model.TreeNode;

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
