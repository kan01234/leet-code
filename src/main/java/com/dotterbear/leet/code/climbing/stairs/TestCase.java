package com.dotterbear.leet.code.climbing.stairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.climbStairs(2), 2);
		assertEquals(solution.climbStairs(3), 3);
		assertEquals(solution.climbStairs(30), 1346269);
	}

}
