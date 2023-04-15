package com.kan01234.leet.code.java.q47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        backtrack(nums, n, result, 0);
        return result;
    }

    private void backtrack(int[] nums, int n, List<List<Integer>> result, int start) {
        if (start == n) {
            // Base case: if start equals to length of nums array, add to result
            List<Integer> currentList = new ArrayList<>();
            for (int num : nums) {
                currentList.add(num);
            }
            result.add(currentList);
        } else {
            Set<Integer> used = new HashSet<>();

            for (int i = start; i < n; i++) {
                if (!used.add(nums[i]))
                    continue;
                // Swap the current number with the start number
                swap(nums, start, i);
                // Recursively generate permutations with the current number fixed at start
                backtrack(nums, n, result, start + 1);
                // Backtrack: swap back to restore original array for next iteration
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}