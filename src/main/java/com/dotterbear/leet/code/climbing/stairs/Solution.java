package com.dotterbear.leet.code.climbing.stairs;

class Solution {

	public int climbStairs(int n) {
		if (n <= 2)
			return n;
		int a = 1;
		int b = 1;
		int c;
		for (int i = 2; i <= n; i++) {
			c = b;
			b += a;
			a = c;
		}
		return b;
	}

}
