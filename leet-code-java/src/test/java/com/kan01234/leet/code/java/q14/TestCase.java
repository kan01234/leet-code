package com.kan01234.leet.code.java.q14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}), "fl");
    assertEquals(solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}), "");
  }

}
