package com.kan01234.leet.code.java.q45;

import java.util.Arrays;

public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] jumps = new int[n]; // Array to store minimum number of jumps for each index
        Arrays.fill(jumps, Integer.MAX_VALUE); // Initialize jumps array with max value
        jumps[0] = 0; // Number of jumps to reach first element is 0

        for (int i = 0; i < n; i++) {
            int maxJump = nums[i];
            for (int j = 1; j <= maxJump && i + j < n; j++) {
                // Update jumps array with minimum jumps to reach index i + j
                jumps[i + j] = Math.min(jumps[i + j], jumps[i] + 1);
            }
        }

        return jumps[n - 1]; // Minimum jumps to reach last element
    }
}
