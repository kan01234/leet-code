package com.kan01234.leet.code.java.common.utils;

import com.kan01234.leet.code.java.common.model.ListNode;

public class ListNodeUtils {

	public static ListNode buildListNode(int... nums) {
		if (nums == null || nums.length == 0)
			return null;
		ListNode head = new ListNode(nums[0]);
		ListNode cur = head;
		for (int i = 1; i < nums.length; i++) {
			cur.next = new ListNode(nums[i]);
			cur = cur.next;
		}
		return head;
	}

	public static boolean equals(ListNode l1, ListNode l2) {
		while (l1 != null || l2 != null) {
			if (l1 == null || l2 == null)
				return false;
			if (l1.val != l2.val)
				return false;
			l1 = l1.next;
			l2 = l2.next;
		}
		return true;
	}

}
