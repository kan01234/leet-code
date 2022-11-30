package com.kan01234.leet.code.java.q112;

/*
 * 112. [Path Sum](https://leetcode.com/problems/path-sum/)
 */

import com.kan01234.leet.code.java.common.model.TreeNode;

class Solution {

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null)
      return false;
    sum -= root.val;
    return (sum == 0 && root.left == null && root.right == null) || hasPathSum(root.left, sum)
        || hasPathSum(root.right, sum);
  }

}
