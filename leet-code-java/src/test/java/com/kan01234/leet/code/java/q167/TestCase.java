package com.kan01234.leet.code.java.q167;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(solution.twoSum(new int[] {2, 7, 11, 15}, 9), new int[] {1, 2});
  }

}
