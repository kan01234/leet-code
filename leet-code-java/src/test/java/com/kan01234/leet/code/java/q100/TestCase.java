package com.kan01234.leet.code.java.q100;

import com.kan01234.leet.code.java.common.utils.TreeNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.isSameTree(TreeNodeUtils.buildTreeNode(1, 2, 3), TreeNodeUtils.buildTreeNode(1, 2, 3)), true);
  }

}
