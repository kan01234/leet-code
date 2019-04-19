package com.dotterbear.leet.code.q12;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.intToRoman(1), "I");
    assertEquals(solution.intToRoman(3), "III");
    assertEquals(solution.intToRoman(4), "IV");
    assertEquals(solution.intToRoman(5), "V");
    assertEquals(solution.intToRoman(6), "VI");
    assertEquals(solution.intToRoman(9), "IX");
    assertEquals(solution.intToRoman(10), "X");
    assertEquals(solution.intToRoman(11), "XI");
    assertEquals(solution.intToRoman(14), "XIV");
    assertEquals(solution.intToRoman(15), "XV");
    assertEquals(solution.intToRoman(90), "XC");
    assertEquals(solution.intToRoman(100), "C");
    assertEquals(solution.intToRoman(400), "CD");
    assertEquals(solution.intToRoman(500), "D");
    assertEquals(solution.intToRoman(900), "CM");
    assertEquals(solution.intToRoman(1000), "M");
    assertEquals(solution.intToRoman(3999), "MMMCMXCIX");

  }

}
