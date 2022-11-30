package com.kan01234.leet.code.java.q169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.majorityElement(new int[] {3, 2, 3}), 3);
    assertEquals(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}), 2);
  }

}
