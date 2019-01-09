package com.dotterbear.leet.code.add.two.numbers;

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode cur = null;
		int carry = 0;
		int sum;
		while (l1 != null || carry > 0 || l2 != null) {
			if (l2 == null)
				l2 = new ListNode(0);
			if (l1 == null)
				l1 = new ListNode(0);
			sum = (l1.val + l2.val + carry);
			carry = sum / 10;
			if (head == null) {
				head = cur = new ListNode(sum % 10);
			} else {
				cur.next = new ListNode(sum % 10);
				cur = cur.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	boolean equals(ListNode l2) {
		ListNode cur = this;
		ListNode cur2 = l2;
		while (cur != null || cur2 != null) {
			if (cur == null || cur2 == null)
				return false;
			if(cur.val != cur2.val)
				return false;
			cur = cur.next;
			cur2 = cur2.next;
		}
		return true;
	}
}