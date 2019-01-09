package com.dotterbear.leet.code.excel.sheet.column.title;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.convertToTitle(1), "A");
		assertEquals(solution.convertToTitle(28), "AB");
		assertEquals(solution.convertToTitle(701), "ZY");
	}

}
