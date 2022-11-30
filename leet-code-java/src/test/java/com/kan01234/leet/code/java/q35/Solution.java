package com.kan01234.leet.code.java.q35;

/*
 * 35. [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
 */

class Solution {

  public int searchInsert(int[] nums, int target) {
    if (nums == null || nums.length == 0)
      return 0;
    int low = 0;
    int high = nums.length - 1;
    int mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (nums[mid] == target)
        return mid;
      else if (nums[mid] > target)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return low;
  }

}
