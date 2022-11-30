package com.kan01234.leet.code.java.q15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 15. [3 Sum](https://leetcode.com/problems/3sum/)
 */

class Solution {

  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> results = new HashSet<List<Integer>>();
    Arrays.sort(nums);
    int a, b, c;
    int left, right;
    int sum;
    for (int i = 0; i < nums.length - 2; i++) {
      a = nums[i];
      left = i + 1;
      right = nums.length - 1;
      while (left < right) {
        b = nums[left];
        c = nums[right];
        sum = a + b + c;
        if (sum == 0) {
          results.add(Arrays.asList(new Integer[] {a, b, c}));
          left++;
          right--;
        } else if (sum > 0)
          right--;
        else
          left++;
      }
    }
    return results.stream().collect(Collectors.toList());
  }

}
