package com.kan01234.leet.code.java.q16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1), 2);
    assertEquals(solution.threeSumClosest(new int[] {1, 2, 4, 8, 16, 32, 64, 128}, 82), 82);
  }

}
