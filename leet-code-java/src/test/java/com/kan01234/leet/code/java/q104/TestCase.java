package com.kan01234.leet.code.java.q104;

import static com.kan01234.leet.code.java.common.utils.TreeNodeUtils.buildTreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

import org.junit.jupiter.api.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.maxDepth(buildTreeNode(3,9,20,null,null,15,7)), 3);
	}

}
