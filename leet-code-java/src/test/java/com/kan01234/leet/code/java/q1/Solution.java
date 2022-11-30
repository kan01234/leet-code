package com.kan01234.leet.code.java.q1;

import java.util.HashMap;
import java.util.Map;

/*
 * 1. [Two Sum](https://leetcode.com/problems/two-sum/)
 */

class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int diff;
    for (int i = 0; i < nums.length; i++) {
      diff = target - nums[i];
      if (map.containsKey(diff))
        return new int[] {map.get(diff), i};
      map.put(nums[i], i);
    }
    return new int[0];
  }

}
