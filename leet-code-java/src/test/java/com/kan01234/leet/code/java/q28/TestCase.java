package com.kan01234.leet.code.java.q28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.strStr("hello", "ll"), 2);
    assertEquals(solution.strStr("aaaaa", "bba"), -1);
  }

}
