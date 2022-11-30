package com.kan01234.leet.code.java.q53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
  }

}
