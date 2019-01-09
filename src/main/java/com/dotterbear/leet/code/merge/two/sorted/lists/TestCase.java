package com.dotterbear.leet.code.merge.two.sorted.lists;

import static com.dotterbear.leet.code.common.utils.ListNodeUtils.buildListNode;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dotterbear.leet.code.common.utils.ListNodeUtils;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(ListNodeUtils.equals(solution.mergeTwoLists(buildListNode(1, 2, 4), buildListNode(1, 3, 4)), buildListNode(1, 1, 2, 3, 4, 4)), true);
	}

}
