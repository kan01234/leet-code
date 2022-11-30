package com.kan01234.leet.code.java.q66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(solution.plusOne(new int[] {1, 2, 3}), new int[] {1, 2, 4});
    assertArrayEquals(solution.plusOne(new int[] {4, 3, 2, 1}), new int[] {4, 3, 2, 2});
    assertArrayEquals(solution.plusOne(new int[] {9, 9, 9}), new int[] {1, 0, 0, 0});
  }

}
