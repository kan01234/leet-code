package com.dotterbear.leet.code.q11;

/*
 * 11. [Container With Most Water](https://leetcode.com/problems/container-with-most-water)
 */

class Solution {

  public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
      }
    }
    return max;
  }

}
