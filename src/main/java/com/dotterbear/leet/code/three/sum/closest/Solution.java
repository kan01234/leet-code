package com.dotterbear.leet.code.three.sum.closest;

import java.util.Arrays;

class Solution {

	public int threeSumClosest(int[] nums, int target) {
		Integer result = null;
		Arrays.sort(nums);
		int a, b,c;
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
				if (sum == target)
					return sum;
				else {
					if (result == null || (Math.abs(target - sum) < Math.abs(target - result)))
						result = sum;
					if (sum > target)
						right--;
					else
						left++;
				}
			}
		}
		return result;
	}

}