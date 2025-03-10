package com.dieg0407.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        do {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        } while (current != null);

        return previous;
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
