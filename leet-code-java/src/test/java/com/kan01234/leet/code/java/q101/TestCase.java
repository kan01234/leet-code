package com.kan01234.leet.code.java.q101;


import com.kan01234.leet.code.java.common.utils.TreeNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.isSymmetric(TreeNodeUtils.buildTreeNode(1, 2, 2, 3, 4, 4, 3)), true);
    assertEquals(solution.isSymmetric(TreeNodeUtils.buildTreeNode(1, 2, 2, null, 3, null, 3)), false);
  }

}
