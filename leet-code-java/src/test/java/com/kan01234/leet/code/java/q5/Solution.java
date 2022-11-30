package com.kan01234.leet.code.java.q5;

/*
 * 5. [The Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
 */

class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.isEmpty())
      return s;
    String result = s.substring(0, 1);
    int maxLength = 1;
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.length() - i < maxLength)
        break;
      for (int j = s.length(); j > i; j--) {
        String cur = s.substring(i, j);
        int length = cur.length();
        if (isPalindrome(cur) && length > maxLength) {
          result = cur;
          maxLength = length;
          break;
        }
      }
    }
    return result;
  }

  private boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;
    while (end > start) {
      if (s.charAt(start) != s.charAt(end))
        return false;
      start++;
      end--;
    }
    return true;
  }
}
