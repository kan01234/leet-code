package com.dotterbear.leet.code.q100;

import static com.dotterbear.leet.code.common.utils.TreeNodeUtils.buildTreeNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.isSameTree(buildTreeNode(1, 2, 3), buildTreeNode(1, 2, 3)), true);
  }

}
