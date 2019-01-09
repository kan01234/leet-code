package com.dotterbear.leet.code.longest.common.prefix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.longestCommonPrefix(new String[] { "flower","flow","flight" }), "fl");
		assertEquals(solution.longestCommonPrefix(new String[] { "dog","racecar","car" }), "");
	}

}
