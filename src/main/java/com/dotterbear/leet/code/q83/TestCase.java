package com.dotterbear.leet.code.q83;

import static com.dotterbear.leet.code.common.utils.ListNodeUtils.buildListNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.dotterbear.leet.code.common.utils.ListNodeUtils;

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
