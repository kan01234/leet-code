package com.dotterbear.leet.code.remove.duplicates.from.sorted.list;

import com.dotterbear.leet.code.common.model.ListNode;

class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		ListNode l;
		while (cur != null) {
			l = cur.next;
			while (l != null && cur.val == l.val) {
				l = l.next;
			}
			cur.next = l;
			cur = cur.next;
		}
		return head;
	}

}
