package com.dotterbear.leet.code.q18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 18. [4Sum](https://leetcode.com/problems/4sum/)
 */

class Solution {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    for (int i = 0; i < nums.length - 3; i++) {
      if (i >= 1 && nums[i] == nums[i - 1])
        continue;
      for (int j = i + 1; j < nums.length - 2; j++) {
        int a, b, c, d;
        int left, right;
        int sum;
        left = j + 1;
        right = nums.length - 1;
        if (j > i + 1 && nums[j] == nums[j - 1])
          continue;
        while (left < right) {
          a = nums[i];
          b = nums[j];
          c = nums[left];
          d = nums[right];
          sum = a + b + c + d;
          if (sum == target) {
            results.add(Arrays.asList(new Integer[] {a, b, c, d}));
            do {
              left++;
            } while (left < nums.length - 1 && nums[left] == nums[left - 1]);
            do {
              right--;
            } while (right > 2 && nums[right] == nums[right + 1]);
          } else if (sum > target)
            right--;
          else
            left++;
        }
      }
    }
    return results;
  }

}
