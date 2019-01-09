package com.dotterbear.leet.code.merge.two.sorted.lists;

import com.dotterbear.leet.code.common.model.ListNode;

class Solution {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode cur = l3;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if (l1 != null)
			cur.next = l1;
		if (l2 != null)
			cur.next = l2;
		return l3.next;
	}

}
