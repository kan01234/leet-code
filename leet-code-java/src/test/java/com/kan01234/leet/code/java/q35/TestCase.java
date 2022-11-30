package com.kan01234.leet.code.java.q35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 5), 2);
    assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 2), 1);
    assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 7), 4);
    assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 0), 0);
  }

}
