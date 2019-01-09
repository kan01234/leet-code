package com.dotterbear.leet.code.sqrt.x;

class Solution {

	public int mySqrt(int x) {
		if (x <= 1)
			return x;
		long sqrt;
		int low = 1;
		int high = x / 2;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			sqrt = ((long) mid * mid);
			if (sqrt == x)
				return mid;
			if (sqrt > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return high;
	}

}
