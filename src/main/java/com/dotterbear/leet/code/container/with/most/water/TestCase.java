package com.dotterbear.leet.code.container.with.most.water;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }), 49);
	}

}
