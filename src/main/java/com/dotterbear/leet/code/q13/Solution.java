package com.dotterbear.leet.code.q13;

import java.util.HashMap;
import java.util.Map;

/*
 * 13. [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
 */

class Solution {
  public int romanToInt(String s) {
    int result = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    char last = s.charAt(0);
    boolean substract = false;
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      substract = (((c == 'V' || c == 'X') && last == 'I')
          || ((c == 'L' || c == 'C') && last == 'X') || ((c == 'D' || c == 'M') && last == 'C'));
      result += (substract ? -1 : 1) * map.get(last);
      last = c;
    }
    result += map.get(last);
    return result;
  }
}
