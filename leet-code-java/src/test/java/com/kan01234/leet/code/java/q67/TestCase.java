package com.kan01234.leet.code.java.q67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.addBinary("11", "1"), "100");
    assertEquals(solution.addBinary("1010", "1011"), "10101");
  }

}
