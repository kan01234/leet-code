package com.dotterbear.leet.code.q101;

import static com.dotterbear.leet.code.common.utils.TreeNodeUtils.buildTreeNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.isSymmetric(buildTreeNode(1, 2, 2, 3, 4, 4, 3)), true);
    assertEquals(solution.isSymmetric(buildTreeNode(1, 2, 2, null, 3, null, 3)), false);
  }

}
