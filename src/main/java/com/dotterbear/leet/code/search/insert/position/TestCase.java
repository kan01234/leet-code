package com.dotterbear.leet.code.search.insert.position;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5), 2);
		assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2), 1);
		assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7), 4);
		assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0), 0);
	}

}
