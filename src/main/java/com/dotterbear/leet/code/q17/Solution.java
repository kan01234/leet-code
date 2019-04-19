package com.dotterbear.leet.code.q17;

import java.util.ArrayList;
import java.util.List;

/*
 * 17. [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */

class Solution {
  public List<String> letterCombinations(String digits) {
    return letterCombinations(digits, "", 0, new ArrayList<String>());
  }

  public List<String> letterCombinations(String digits, String input, int i, List<String> results) {
    if (digits == null || i >= digits.length()) {
      if (input != null && !input.isEmpty())
        results.add(input);
      return results;
    }
    char cur = digits.charAt(i);
    if (cur >= '2' && cur <= '9') {
      char[] letters = null;
      switch (cur) {
        case '2':
          letters = new char[] {'a', 'b', 'c'};
          break;
        case '3':
          letters = new char[] {'d', 'e', 'f'};
          break;
        case '4':
          letters = new char[] {'g', 'h', 'i'};
          break;
        case '5':
          letters = new char[] {'j', 'k', 'l'};
          break;
        case '6':
          letters = new char[] {'m', 'n', 'o'};
          break;
        case '7':
          letters = new char[] {'p', 'q', 'r', 's'};
          break;
        case '8':
          letters = new char[] {'t', 'u', 'v'};
          break;
        case '9':
          letters = new char[] {'w', 'x', 'y', 'z'};
          break;
        default:
          break;
      }
      for (char c : letters)
        letterCombinations(digits, input + c, i + 1, results);
    }
    return results;
  }
}
