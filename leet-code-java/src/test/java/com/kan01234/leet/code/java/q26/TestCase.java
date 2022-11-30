package com.kan01234.leet.code.java.q26;

import org.junit.jupiter.api.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    solution.removeDuplicates(new int[] {1, 1, 2}); /* should be [1, 2, ...] */
    solution.removeDuplicates(
        new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}); /* should be [0, 1, 2, 3, 4, ...] */
  }

}
