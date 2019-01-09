package com.dotterbear.leet.code.common.utils;

import java.util.Arrays;

import com.dotterbear.leet.code.common.model.TreeNode;

public class TreeNodeUtils {

	public static TreeNode buildTreeNode(Integer... nums) {
		if (nums == null || nums.length == 0)
			return null;
		return buildTreeNode(nums, null, 0);
	}

	private static TreeNode buildTreeNode(Integer[] nums, TreeNode root, int i) {
		if (i < nums.length) {
			TreeNode temp = new TreeNode(nums[i]);
			root = temp;
			root.left = buildTreeNode(nums, root.left, 2 * i + 1);
			root.right = buildTreeNode(nums, root.right, 2 * i + 2);
		}
		return root;
	}

}
