package com.dotterbear.leet.code.implement.strstr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.strStr("hello", "ll"), 2);
		assertEquals(solution.strStr("aaaaa", "bba"), -1);
	}

}
