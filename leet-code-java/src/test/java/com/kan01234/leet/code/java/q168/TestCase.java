package com.kan01234.leet.code.java.q168;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.convertToTitle(1), "A");
    assertEquals(solution.convertToTitle(28), "AB");
    assertEquals(solution.convertToTitle(701), "ZY");
  }

}
