package com.kan01234.leet.code.java.q169;

import java.util.Arrays;

/*
 * 169. [Majority Element](https://leetcode.com/problems/majority-element/)
 */

class Solution {

  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

}
