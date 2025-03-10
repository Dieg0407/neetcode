package com.dieg0407.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycleDetection {
    private final Map<Integer, Integer> map = new HashMap<>();

    public boolean hasCycle(ListNode head) {
        int idx = 0;
        while (head != null) {
            if (map.containsKey(head.val)) {
                return true;
            }

            map.put(head.val, idx++);
            head = head.next;
        }

        return false;
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
