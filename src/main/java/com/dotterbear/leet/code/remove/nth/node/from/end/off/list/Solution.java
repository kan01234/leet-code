package com.dotterbear.leet.code.remove.nth.node.from.end.off.list;

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || head.next == null)
      return null;
    int count = 0;
    ListNode cur = head;
    ListNode tbd = head;
    while (cur.next != null) {
      if (count++ >= n) {
        tbd = tbd.next;
      }
      cur = cur.next;
    }
    if (count + 1 == n)
      return head.next;
    tbd.next = tbd.next == cur ? null : tbd.next.next;
    return head;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

}
