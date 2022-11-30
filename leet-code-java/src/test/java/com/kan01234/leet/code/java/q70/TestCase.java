package com.kan01234.leet.code.java.q70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.climbStairs(2), 2);
    assertEquals(solution.climbStairs(3), 3);
    assertEquals(solution.climbStairs(30), 1346269);
  }

}
