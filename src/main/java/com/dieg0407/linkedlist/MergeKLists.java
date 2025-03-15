package com.dieg0407.linkedlist;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1 && lists[0] == null) {
            return null;
        }

        ListNode head = null;
        ListNode current = null;

        while (true) {
            int selectedIndex = -1;
            int currentMin = Integer.MAX_VALUE;

            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (currentMin > lists[i].val) {
                    currentMin = lists[i].val;
                    selectedIndex = i;
                }
            }

            if (selectedIndex == -1) {
                break;
            }

            lists[selectedIndex] = lists[selectedIndex].next;
            if (head == null) {
                head = new ListNode(currentMin);
                current = head;
                continue;
            }

            current.next = new ListNode(currentMin);
            current = current.next;
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
