package com.kan01234.leet.code.java.q112;

import com.kan01234.leet.code.java.common.utils.TreeNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
        solution.hasPathSum(TreeNodeUtils.buildTreeNode(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22),
        true);
  }
}
