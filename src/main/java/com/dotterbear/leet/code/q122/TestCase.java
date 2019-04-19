package com.dotterbear.leet.code.q122;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4}), 7);
    assertEquals(solution.maxProfit(new int[] {1, 2, 3, 4, 5}), 4);
  }

}
