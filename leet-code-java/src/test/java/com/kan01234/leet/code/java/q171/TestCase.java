package com.kan01234.leet.code.java.q171;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.titleToNumber("A"), 1);
    assertEquals(solution.titleToNumber("AB"), 28);
    assertEquals(solution.titleToNumber("ZY"), 701);
  }

}
