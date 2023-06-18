package com.kan01234.leet.code.java.q594;

import java.util.Arrays;

/*
 * time complexity: O(N log N), for sorting
 * space complexity: O(1)
 */

public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int longestSubsequence = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            int diff = nums[right] - nums[left];

            if (diff == 1) {
                longestSubsequence = Math.max(longestSubsequence, right - left + 1);
                right++;
            } else if (diff > 1) {
                left++;
            } else {
                right++;
            }
        }

        return longestSubsequence;
    }
}
