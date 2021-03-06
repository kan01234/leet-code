package com.dotterbear.leet.code.q53;

/*
 * 53. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
 */

class Solution {

  public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int count = 0;
    for (int num : nums) {
      if (count + num < num)
        count = num;
      else {
        count += num;
      }
      max = Math.max(count, max);
    }
    return max;
  }

}
