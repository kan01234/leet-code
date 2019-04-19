package com.dotterbear.leet.code.q58;

/*
 * 58. [Length of Last Word](https://leetcode.com/problems/length-of-last-word/)
 */

class Solution {

  public int lengthOfLastWord(String s) {
    s = s.trim();
    return s.length() - s.lastIndexOf(' ') - 1;
  }
}
