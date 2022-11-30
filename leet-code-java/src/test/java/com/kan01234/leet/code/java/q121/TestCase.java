package com.kan01234.leet.code.java.q121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4}), 5);
    assertEquals(solution.maxProfit(new int[] {7, 6, 4, 3, 1}), 0);
  }

}
