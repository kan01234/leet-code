package com.dotterbear.leet.code.remove.duplicates.from.sorted.array;

class Solution {

	public int removeDuplicates(int[] nums) {
		if (nums == null)
			return 0;
		int length = nums.length;
		if (length <= 1)
			return length;
		int ans = 1;
		int last = nums[0];
		int cur;
		for (int i = 1; i < length; i++) {
			cur = nums[i];
			if (last == cur) {
				for (int j = i; j < length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				length--;
				i--;
			} else {
				last = cur;
				ans++;
			}
		}
		return ans;
	}

}
