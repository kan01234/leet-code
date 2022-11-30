package com.kan01234.leet.code.java.q24;

/**
 * 24. [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)
 */

class Solution {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null)
      return head;
    ListNode cur, tmp, tmpNext, pre = null;
    cur = head;
    tmp = cur;
    tmpNext = cur.next.next;
    head = cur.next;
    head.next = cur;
    head.next.next = tmpNext;

    pre = cur;
    cur = cur.next;
    while (cur != null && cur.next != null) {
      tmp = cur;
      tmpNext = cur.next.next;
      cur = cur.next;
      cur.next = tmp;
      cur.next.next = tmpNext;
      pre.next = cur;

      pre = cur.next;
      cur = cur.next.next;
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
}
