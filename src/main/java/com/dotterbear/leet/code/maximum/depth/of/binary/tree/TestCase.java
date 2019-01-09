package com.dotterbear.leet.code.maximum.depth.of.binary.tree;

import static com.dotterbear.leet.code.common.utils.TreeNodeUtils.buildTreeNode;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.maxDepth(buildTreeNode(3,9,20,null,null,15,7)), 3);
	}

}
