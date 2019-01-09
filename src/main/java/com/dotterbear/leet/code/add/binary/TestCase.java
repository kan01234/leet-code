package com.dotterbear.leet.code.add.binary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.addBinary("11", "1"), "100");
		assertEquals(solution.addBinary("1010", "1011"), "10101");
	}

}
