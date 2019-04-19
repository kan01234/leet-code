package com.dotterbear.leet.code.q16;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1), 2);
    assertEquals(solution.threeSumClosest(new int[] {1, 2, 4, 8, 16, 32, 64, 128}, 82), 82);
  }

}
