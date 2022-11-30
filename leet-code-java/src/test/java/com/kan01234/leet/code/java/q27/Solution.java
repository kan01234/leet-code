package com.kan01234.leet.code.java.q27;

/*
 * 27. [Remove Element](https://leetcode.com/problems/remove-element/)
 */

class Solution {

  public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++)
      if (nums[j] != val)
        nums[i++] = nums[j];
    return i;
  }

}
