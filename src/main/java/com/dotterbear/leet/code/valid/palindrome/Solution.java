package com.dotterbear.leet.code.valid.palindrome;

class Solution {

	public boolean isPalindrome(String s) {
		if (s == null || s.length() < 2)
			return true;
		int start = 0;
		int end = s.length() - 1;
		char a, b;
		boolean result = false;
		int count = 0;
		while (start < end) {
			a = s.charAt(start);
			b = s.charAt(end);
			if (!Character.isLetter(a) && !Character.isDigit(a)) {
				start++;
				continue;
			}
			if (!Character.isLetter(b) && !Character.isDigit(b)) {
				end--;
				continue;
			}
			count++;
			result = Character.toUpperCase(a) == Character.toUpperCase(b);
			if (result == false)
				return result;
			start++;
			end--;
		}
		return result || count == 0;
	}

}
