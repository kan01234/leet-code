package com.dotterbear.leet.code.common.utils;

import java.util.Arrays;

import com.dotterbear.leet.code.common.model.TreeNode;

public class TreeNodeUtils {

	public static TreeNode buildTreeNode(int... nums) {
		if (nums == null || nums.length == 0)
			return null;
		return buildTreeNode(Arrays.copyOfRange(nums, 1, nums.length), new TreeNode(nums[0]), 0);
	}

	private static TreeNode buildTreeNode(int[] arr, TreeNode root, int i) {
		if (i < arr.length) {
			TreeNode temp = new TreeNode(arr[i]);
			root = temp;
			root.left = buildTreeNode(arr, root.left, 2 * i + 1);
			root.right = buildTreeNode(arr, root.right, 2 * i + 2);
		}
		return root;
	}

}
