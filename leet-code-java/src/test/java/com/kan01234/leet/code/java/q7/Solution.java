package com.kan01234.leet.code.java.q7;

/*
 * 7. [Reverse Integer](https://leetcode.com/problems/reverse-integer/)
 */

class Solution {
  public int reverse(int x) {
    String str = x + "";
    boolean isNegative = str.startsWith("-");
    StringBuilder sb = new StringBuilder(str.replace("-", ""));
    try {
      return Integer.parseInt(sb.reverse().toString()) * (isNegative ? -1 : 1);
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}
