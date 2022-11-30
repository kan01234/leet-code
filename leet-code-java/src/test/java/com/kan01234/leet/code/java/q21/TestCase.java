package com.kan01234.leet.code.java.q21;

import org.junit.jupiter.api.Test;

import com.kan01234.leet.code.java.common.utils.ListNodeUtils;

import static com.kan01234.leet.code.java.common.utils.ListNodeUtils.buildListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
        ListNodeUtils.equals(solution.mergeTwoLists(buildListNode(1, 2, 4), buildListNode(1, 3, 4)),
            buildListNode(1, 1, 2, 3, 4, 4)),
        true);
  }

}
