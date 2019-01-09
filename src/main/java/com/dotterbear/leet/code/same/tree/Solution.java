package com.dotterbear.leet.code.same.tree;

import com.dotterbear.leet.code.common.model.TreeNode;

class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null)
			return p == q;
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}
