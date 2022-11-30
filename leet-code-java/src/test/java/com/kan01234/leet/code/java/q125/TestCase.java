package com.kan01234.leet.code.java.q125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    assertFalse(solution.isPalindrome("race a car"));
  }

}
