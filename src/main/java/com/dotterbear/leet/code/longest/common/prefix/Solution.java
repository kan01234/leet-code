package com.dotterbear.leet.code.longest.common.prefix;

class Solution {
	public String longestCommonPrefix(String[] strs) {
		String ans = "";
		if (strs == null || strs.length == 0)
			return ans;
		if (strs.length == 1)
			return strs[0];

		boolean isDiff = false;
		String head = strs[0];
		for (int j = 0; j < strs[0].length(); j++) {
			char c = head.charAt(j);
			for (int i = 1; i < strs.length; i++) {
				String str = strs[i];
				if (j >= str.length() || c != str.charAt(j)) {
					isDiff = true;
					break;
				}
			}
			if (isDiff)
				break;
			ans += c;
		}
		return ans;
	}
}
