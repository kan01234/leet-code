package com.dotterbear.leet.code.majority.element;

import java.util.Arrays;

class Solution {

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

}
