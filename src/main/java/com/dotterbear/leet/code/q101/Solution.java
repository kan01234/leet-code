package com.dotterbear.leet.code.q101;

import com.dotterbear.leet.code.common.model.TreeNode;

/*
 * 101. [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
 */

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
