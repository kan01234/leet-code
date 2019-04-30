package com.dotterbear.leet.code.q167;

/*
 * 167. [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
 */

class Solution {

  public int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length - 1;
    while (i < j) {
      int sum = numbers[i] + numbers[j];
      if (sum == target)
        return new int[] {i + 1, j + 1};
      while (sum > target) {
        j--;
        sum = numbers[i] + numbers[j];
      }
      while (sum < target) {
        i++;
        sum = numbers[i] + numbers[j];
      }
    }
    return new int[2];
  }

}
