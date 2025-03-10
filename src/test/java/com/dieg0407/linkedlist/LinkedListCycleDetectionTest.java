package com.dieg0407.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListCycleDetectionTest {
    private final LinkedListCycleDetection solution = new LinkedListCycleDetection();

    @Test
    void example1() {
        LinkedListCycleDetection.ListNode head = new LinkedListCycleDetection.ListNode(3);
        LinkedListCycleDetection.ListNode node1 = new LinkedListCycleDetection.ListNode(2);
        LinkedListCycleDetection.ListNode node2 = new LinkedListCycleDetection.ListNode(0);
        LinkedListCycleDetection.ListNode node3 = new LinkedListCycleDetection.ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        assertTrue(solution.hasCycle(head));
    }

    @Test
    void example2() {
        LinkedListCycleDetection.ListNode head = new LinkedListCycleDetection.ListNode(1);
        LinkedListCycleDetection.ListNode node1 = new LinkedListCycleDetection.ListNode(2);

        head.next = node1;
        node1.next = null;

        assertFalse(solution.hasCycle(head));
    }
}
