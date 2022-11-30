package com.kan01234.leet.code.java.q2;

import org.junit.jupiter.api.Test;

import com.kan01234.leet.code.java.common.utils.ListNodeUtils;

import static com.kan01234.leet.code.java.common.utils.ListNodeUtils.buildListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
        ListNodeUtils.equals(solution.addTwoNumbers(buildListNode(2, 4, 3), buildListNode(5, 6, 4)),
            buildListNode(7, 0, 8)),
        true);
  }

}
