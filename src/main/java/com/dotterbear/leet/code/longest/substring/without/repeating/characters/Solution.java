package com.dotterbear.leet.code.longest.substring.without.repeating.characters;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    List<Character> chars = new ArrayList<Character>();
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int find = chars.indexOf(c);
      if (!(find >= 0)) {
        chars.add(s.charAt(i));
      } else {
        result = Math.max(chars.size(), result);
        chars = chars.subList(find + 1, chars.size());
        chars.add(s.charAt(i));
      }
    }
    return Math.max(chars.size(), result);
  }
}
