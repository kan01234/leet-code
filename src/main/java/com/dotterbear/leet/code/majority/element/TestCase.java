package com.dotterbear.leet.code.majority.element;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.majorityElement(new int[] { 3, 2, 3 }), 3);
		assertEquals(solution.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }), 2);
	}

}
