package com.kan01234.leet.code.java.q34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int left = -1;
        int right = -1;

        int l = 0;
        int r = n - 1;

        // find left most
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            if (nums[mid] == target) {
                left = mid;
            }
        }

        l = 0;
        r = n - 1;

        // find right most
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            if (nums[mid] == target) {
                right = mid;
            }
        }

        return new int[] { left, right };
    }
}
