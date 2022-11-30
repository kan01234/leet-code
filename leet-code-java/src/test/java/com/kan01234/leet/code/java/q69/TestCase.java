package com.kan01234.leet.code.java.q69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.mySqrt(4), 2);
    assertEquals(solution.mySqrt(8), 2);
    assertEquals(solution.mySqrt(24), 4);
  }

}
