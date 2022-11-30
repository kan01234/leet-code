package com.kan01234.leet.code.java.q20;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.isValid("()"), true);
    assertEquals(solution.isValid("()[]{}"), true);
    assertEquals(solution.isValid("(]"), false);
    assertEquals(solution.isValid("([)]"), false);
    assertEquals(solution.isValid("{[]}"), true);
  }

}
