package com.dotterbear.leet.code.valid.palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.isPalindrome("A man, a plan, a canal: Panama"), true);
		assertEquals(solution.isPalindrome("race a car"), false);
	}

}
