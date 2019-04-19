package com.dotterbear.leet.code.q112;

import static com.dotterbear.leet.code.common.utils.TreeNodeUtils.buildTreeNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
        solution.hasPathSum(buildTreeNode(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22),
        true);
    assertEquals(
        solution.hasPathSum(buildTreeNode(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 23),
        true);
  }

}
