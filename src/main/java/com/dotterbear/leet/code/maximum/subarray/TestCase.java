package com.dotterbear.leet.code.maximum.subarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }), 6);
	}

}
