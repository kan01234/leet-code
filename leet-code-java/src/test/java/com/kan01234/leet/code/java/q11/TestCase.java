package com.kan01234.leet.code.java.q11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
  }

}
