package com.kan01234.leet.code.java.q101;

/*
 * 101. [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
 */

import com.kan01234.leet.code.java.common.model.TreeNode;

class Solution {

  public boolean isSymmetric(TreeNode root) {
    if (root == null)
      return true;
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null)
      return true;
    if ((left == null && right != null) || (right == null && left != null))
      return false;
    if (left.val == right.val)
      return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    return false;
  }

}
