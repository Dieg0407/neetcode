package com.dieg0407.linkedlist;

public class ReorderLinkedList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        // find the middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half of the list
        ListNode newHead;
        ListNode current = slow.next;
        ListNode prev = slow.next = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        newHead = prev;

        // rejoin the lists
        ListNode firstHalf = head;
        ListNode secondHalf = newHead;

        while (secondHalf != null) {
            ListNode next1 = head.next;
            ListNode next2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = next1;

            firstHalf = next1;
            secondHalf = next2;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
