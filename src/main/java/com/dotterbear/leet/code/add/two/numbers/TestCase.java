package com.dotterbear.leet.code.add.two.numbers;

import static com.dotterbear.leet.code.common.utils.ListNodeUtils.buildListNode;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dotterbear.leet.code.common.utils.ListNodeUtils;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(ListNodeUtils.equals(solution.addTwoNumbers(buildListNode(2, 4, 3), buildListNode(5, 6, 4)), buildListNode(7, 0, 8)), true);
	}

}
