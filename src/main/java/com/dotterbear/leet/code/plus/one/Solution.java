package com.dotterbear.leet.code.plus.one;

class Solution {

	public int[] plusOne(int[] digits) {
		int length = digits.length;
		digits[length - 1] += 1;
		if (digits[length - 1] < 10)
			return digits;
		int[] digits2 = new int[length + 1];
		int lead = 0, digit;
		for (int i = length - 1; i >= 0; i--) {
			digit = digits[i] + lead;
			if (digit >= 10) {
				lead = 1;
				digit %= 10;
			} else {
				lead = 0;
				digits[i] = digit;
				break;
			}
			digits[i] = digit;
			digits2[i + 1] = digit;
		}
		if (lead > 0) {
			digits2[0] = 1;
			return digits2;
		}
		return digits;
	}

}
