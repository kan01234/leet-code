package com.dotterbear.leet.code.q111;

/**
 * 104. [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
 */

class Solution {
  public int minDepth(TreeNode root) {
    if (root == null)
      return 0;
    int count = Integer.MAX_VALUE;
    if (root.left == null && root.right == null)
      return 1;
    if (root.left != null)
      count = Math.min(minDepth(root.left), count);
    if (root.right != null)
      count = Math.min(minDepth(root.right), count);
    return count + 1;
  }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}
