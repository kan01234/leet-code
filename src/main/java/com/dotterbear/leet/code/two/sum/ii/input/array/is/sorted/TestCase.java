package com.dotterbear.leet.code.two.sum.ii.input.array.is.sorted;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertArrayEquals(solution.twoSum(new int[] { 2, 7, 11, 15 }, 9), new int[] { 1, 2 });
	}

}
