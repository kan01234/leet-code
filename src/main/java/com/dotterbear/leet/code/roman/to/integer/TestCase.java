package com.dotterbear.leet.code.roman.to.integer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.romanToInt("III"), 3);
		assertEquals(solution.romanToInt("IV"), 4);
		assertEquals(solution.romanToInt("IX"), 9);
		assertEquals(solution.romanToInt("LVIII"), 58);
		assertEquals(solution.romanToInt("MCMXCIV"), 1994);
	}

}
