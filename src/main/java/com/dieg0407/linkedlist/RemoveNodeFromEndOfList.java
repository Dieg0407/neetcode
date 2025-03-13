package com.dieg0407.linkedlist;

public class RemoveNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode current = head;
        ListNode forwarder = head;
        for (int i = 0; i < n; i++) {
            forwarder = forwarder.next;
        }

        // this means n is the full length of the list
        if (forwarder == null) {
            return head.next;
        }

        while (forwarder.next != null) {
            current = current.next;
            forwarder = forwarder.next;
        }

        current.next = current.next.next;

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
