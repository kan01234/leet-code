package com.dotterbear.leet.code.mini.stack;

import java.util.Stack;

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
