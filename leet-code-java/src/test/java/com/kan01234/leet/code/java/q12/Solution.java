package com.kan01234.leet.code.java.q12;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 12. [Integer to Roman](https://leetcode.com/problems/integer-to-roman/)
 */

class Solution {
  public String intToRoman(int num) {
    Map<Integer, String> map = new LinkedHashMap<Integer, String>();
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
    String roman = "";
    for (int i : map.keySet()) {
      while (num >= i) {
        num -= i;
        roman += map.get(i);
      }
    }
    return roman;
  }
}
