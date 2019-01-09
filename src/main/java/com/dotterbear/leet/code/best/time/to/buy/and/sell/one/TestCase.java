package com.dotterbear.leet.code.best.time.to.buy.and.sell.one;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }), 5);
		assertEquals(solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }), 0);
	}

}
