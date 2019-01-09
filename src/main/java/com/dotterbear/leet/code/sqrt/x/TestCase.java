package com.dotterbear.leet.code.sqrt.x;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.mySqrt(4), 2);
		assertEquals(solution.mySqrt(8), 2);
		assertEquals(solution.mySqrt(24), 4);
	}

}
