package com.dotterbear.leet.code.q171;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.titleToNumber("A"), 1);
    assertEquals(solution.titleToNumber("AB"), 28);
    assertEquals(solution.titleToNumber("ZY"), 701);
  }

}
