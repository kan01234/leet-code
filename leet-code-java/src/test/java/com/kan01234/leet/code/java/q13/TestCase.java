package com.kan01234.leet.code.java.q13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.romanToInt("III"), 3);
    assertEquals(solution.romanToInt("IV"), 4);
    assertEquals(solution.romanToInt("IX"), 9);
    assertEquals(solution.romanToInt("LVIII"), 58);
    assertEquals(solution.romanToInt("MCMXCIV"), 1994);
  }

}
