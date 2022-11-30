package com.kan01234.leet.code.java.q100;

/*
 * 100. [Same Tree](https://leetcode.com/problems/same-tree/)
 */

import com.kan01234.leet.code.java.common.model.TreeNode;

class Solution {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null)
      return p == q;
    return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }

}
