package com.kan01234.leet.code.java.q31;

import java.util.Arrays;
public class Solution {
    public void nextPermutation(int[] nums) {

        // find first descending index from end => i
        int n = nums.length;
        int i = n - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        // return sorte array
        if (i == -1) {
            Arrays.sort(nums);
            return;
        }

        // find index of first element greater than nums[i] from end
        int j = n - 1;
        for (; j > 0; j--) {
            if (nums[j] > nums[i])
                break;
        }

        // swap i, j
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        // sort nums from i
        Arrays.sort(nums, i + 1, n);

    }

}
