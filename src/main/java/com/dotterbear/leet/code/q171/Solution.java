package com.dotterbear.leet.code.q171;

/*
 * 171. [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/)
 */

class Solution {

  public int titleToNumber(String s) {
    int result = 0;
    int count = 1;
    int len = s.length() - 1;
    for (int i = len; i >= 0; i--) {
      result += (s.charAt(i) - 'A' + 1) * count;
      count *= 26;
    }
    return result;
  }

}
