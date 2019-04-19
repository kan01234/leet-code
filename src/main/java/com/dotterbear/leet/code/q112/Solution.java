package com.dotterbear.leet.code.q112;

import com.dotterbear.leet.code.common.model.TreeNode;

/*
 * 112. [Path Sum](https://leetcode.com/problems/path-sum/)
 */

class Solution {

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null)
      return false;
    sum -= root.val;
    return (sum == 0 && root.left == null && root.right == null) || hasPathSum(root.left, sum)
        || hasPathSum(root.right, sum);
  }

}
