package com.kan01234.leet.code.java.q53;

/*
 * 53. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
 *
 * https://en.wikipedia.org/wiki/Maximum_subarray_problem
 *
 * time complexity: O(N)
 * memory complexity: O(N)
 */

class Solution {

  public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int currentSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
  }

}
