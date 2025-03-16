package com.dieg0407.linkedlist;

public class ReverseKNodeGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode newHead = null;

        ListNode previousTail = null;
        ListNode currentHead = head;
        ListNode currentTail = head;
        int i = 0;
        while (currentTail != null) {
            i++;
            if (i % k != 0) {
                currentTail = currentTail.next;
                continue;
            }
            ListNode next = currentTail.next;

            ListNode[] reversed = reverseSubGroup(currentHead, currentTail);
            reversed[1].next = next;
            if (newHead == null) {
                newHead = reversed[0];
            }
            if (previousTail != null) {
                previousTail.next = reversed[0];
            }
            previousTail = reversed[1];
            currentHead = next;
            currentTail = next;
        }
        if (currentHead != null && previousTail != null) {
            previousTail.next = currentHead;
        }

        return newHead;
    }

    public ListNode[] reverseSubGroup(ListNode head, ListNode end) {
        ListNode current = head;
        ListNode prev = null;

        while (current != end) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;

        return new ListNode[] { end, head };
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
