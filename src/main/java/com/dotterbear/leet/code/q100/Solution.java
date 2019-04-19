package com.dotterbear.leet.code.q100;

import com.dotterbear.leet.code.common.model.TreeNode;

/*
 * 100. [Same Tree](https://leetcode.com/problems/same-tree/)
 */

class Solution {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null)
      return p == q;
    return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }

}
