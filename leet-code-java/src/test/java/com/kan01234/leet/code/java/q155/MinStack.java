package com.kan01234.leet.code.java.q155;

import java.util.Stack;

/*
 * 155. [Mini Stack](https://leetcode.com/problems/min-stack/)
 */

class MinStack {

  int min = Integer.MAX_VALUE;
  Stack<Integer> stack;

  public MinStack() {
    stack = new Stack<Integer>();
  }

  public void push(int x) {
    if (x <= min) {
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public void pop() {
    int i = stack.pop();
    if (i == min)
      min = stack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }
}
