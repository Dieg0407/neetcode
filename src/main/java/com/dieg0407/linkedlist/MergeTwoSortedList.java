package com.dieg0407.linkedlist;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode prev = null;

        while (list1 != null || list2 != null) {
            int list1Val = list1 != null ? list1.val : Integer.MAX_VALUE;
            int list2Val = list2 != null ? list2.val : Integer.MAX_VALUE;

            ListNode node;
            if (list1Val < list2Val) {
                node = new ListNode(list1Val);
                list1 = list1.next;
            } else {
                node = new ListNode(list2Val);
                list2 = list2.next;
            }
            if (head == null) {
                head = node;
            }
            if (prev != null) {
                prev.next = node;
            }
            prev = node;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
