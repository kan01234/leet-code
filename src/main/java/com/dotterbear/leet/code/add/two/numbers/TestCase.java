package com.dotterbear.leet.code.add.two.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(solution.addTwoNumbers(buildListNode(2, 4, 3), buildListNode(5, 6, 4)).equals(buildListNode(7, 0, 8)), true);
	}

	private ListNode buildListNode(int... nums) {
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

}
