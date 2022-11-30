package com.kan01234.leet.code.java.q28;

/*
 * 28. [Implement strStr()](https://leetcode.com/problems/implement-strstr/)
 */

class Solution {

  public int strStr(String haystack, String needle) {
    int hLen = haystack.length();
    int nLen = needle.length();
    for (int i = 0; i < hLen; i++) {
      if (i + nLen > hLen)
        return -1;
      if (haystack.substring(i, i + nLen).equals(needle))
        return i;
    }
    return -1;
  }

}
