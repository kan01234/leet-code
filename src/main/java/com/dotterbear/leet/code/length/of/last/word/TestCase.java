package com.dotterbear.leet.code.length.of.last.word;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.lengthOfLastWord("Hello World"), 5);
	}

}
