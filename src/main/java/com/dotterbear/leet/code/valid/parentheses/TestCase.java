package com.dotterbear.leet.code.valid.parentheses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.isValid("()"), true);
		assertEquals(solution.isValid("()[]{}"), true);
		assertEquals(solution.isValid("(]"), false);
		assertEquals(solution.isValid("([)]"), false);
		assertEquals(solution.isValid("{[]}"), true);
	}

}
