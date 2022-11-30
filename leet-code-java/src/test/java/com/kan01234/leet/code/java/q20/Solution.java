package com.kan01234.leet.code.java.q20;

import java.util.Stack;

/*
 * 20. [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
 */

class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    boolean result = true;
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
        continue;
      }
      if (stack.empty() || (c == ')' && stack.pop() != '(') || (c == ']' && stack.pop() != '[')
          || (c == '}' && stack.pop() != '{')) {
        result = false;
        break;
      }
    }
    return result && stack.empty();
  }
}
