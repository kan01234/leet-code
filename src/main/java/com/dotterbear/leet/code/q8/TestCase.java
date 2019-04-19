package com.dotterbear.leet.code.q8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.myAtoi("42"), 42);
    assertEquals(solution.myAtoi("        -42"), -42);
    assertEquals(solution.myAtoi("-12-12"), -12);
    assertEquals(solution.myAtoi("91283472332"), Integer.MAX_VALUE);
    assertEquals(solution.myAtoi("words and 987"), 0);
    assertEquals(solution.myAtoi("+-2"), 0);
    assertEquals(solution.myAtoi("-  234"), 0);
  }

}
