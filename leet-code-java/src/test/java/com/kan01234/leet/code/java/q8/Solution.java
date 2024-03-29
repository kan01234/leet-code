package com.kan01234.leet.code.java.q8;

import java.math.BigInteger;

/*
 * 8. [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/)
 */

class Solution {

  public int myAtoi(String str) {
    if (str == null | str.isEmpty())
      return 0;
    boolean isDigitOccur = false;
    boolean isSignOccur = false;
    String pending = "";
    str = str.trim();
    for (char c : str.toCharArray()) {
      if (c == '+' || c == '-') {
        if (!isSignOccur && !isDigitOccur) {
          pending += c;
          isSignOccur = true;
        } else
          break;
      } else if (Character.isDigit(c)) {
        pending += c;
        isDigitOccur = true;
      } else
        break;
    }
    if (pending.isEmpty() || (!isDigitOccur && isSignOccur))
      return 0;
    BigInteger result = new BigInteger(pending);
    if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) == 1)
      return Integer.MAX_VALUE;
    else if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) == -1)
      return Integer.MIN_VALUE;
    else
      return result.intValue();
  }

}
