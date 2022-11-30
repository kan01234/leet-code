package com.kan01234.leet.code.java.q83;

/*
 * 83. [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */

import com.kan01234.leet.code.java.common.model.ListNode;

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
