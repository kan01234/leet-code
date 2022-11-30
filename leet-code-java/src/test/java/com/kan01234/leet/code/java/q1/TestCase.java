package com.kan01234.leet.code.java.q1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(solution.twoSum(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1});
  }

}
