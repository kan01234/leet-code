package com.kan01234.leet.code.java.q83;

import org.junit.jupiter.api.Test;

import com.kan01234.leet.code.java.common.utils.ListNodeUtils;

import static com.kan01234.leet.code.java.common.utils.ListNodeUtils.buildListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(ListNodeUtils.equals(solution.deleteDuplicates(buildListNode(1, 1, 2)),
        buildListNode(1, 2)), true);
    assertEquals(ListNodeUtils.equals(solution.deleteDuplicates(buildListNode(1, 1, 2, 2, 3, 3)),
        buildListNode(1, 2, 3)), true);
  }

}
