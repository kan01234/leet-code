package com.dotterbear.leet.code.add.binary;

class Solution {

	public String addBinary(String a, String b) {
		int maxLength = Math.max(a.length(), b.length());
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int sum;
		for (int i = 1; i <= maxLength; i++) {
			sum = (i > a.length() ? 0 : Integer.parseInt(a.charAt(a.length() - i) + ""))
					+ (i > b.length() ? 0 : Integer.parseInt(b.charAt(b.length() - i) + "")) + carry;
			sb.insert(0, sum % 2);
			carry = sum / 2;
		}
		if (carry > 0)
			sb.insert(0, 1);
		return sb.toString();
	}

}
