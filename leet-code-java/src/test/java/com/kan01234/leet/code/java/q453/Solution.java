package com.kan01234.leet.code.java.q453;

/**
 * math problem
 * let x is same value of nums
 * min is minimum value in nums
 * n is length of length
 * sum is sum of nums
 * k is the operation
 *
 * x = min + k
 * sum + (n - 1) * k = = n * x
 *
 * sum + (n - 1) * k = n * (min + k)
 * sum + (n - 1) * k = n * min + n * k
 * k = sum - n * min
 *
 * time complexity: O(N)
 * memory complexity: O(N)
 */
public class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
        }
        return sum - min * n;
    }
}
