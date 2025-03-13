package com.dieg0407.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveNodeFromEndOfListTest {
    private final RemoveNodeFromEndOfList solution = new RemoveNodeFromEndOfList();

    @Test
    void example1() {
        // Input: head = [1,2,3,4], n = 2
        // Output: [1,2,4]
        RemoveNodeFromEndOfList.ListNode head = new RemoveNodeFromEndOfList.ListNode(1);
        head.next = new RemoveNodeFromEndOfList.ListNode(2);
        head.next.next = new RemoveNodeFromEndOfList.ListNode(3);
        head.next.next.next = new RemoveNodeFromEndOfList.ListNode(4);

        RemoveNodeFromEndOfList.ListNode newHead = solution.removeNthFromEnd(head, 2);

        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(4, newHead.next.next.val);
    }

    @Test
    void example2() {
        // Input: head = [5], n = 1
        // Output: []
        RemoveNodeFromEndOfList.ListNode head = new RemoveNodeFromEndOfList.ListNode(5);

        RemoveNodeFromEndOfList.ListNode newHead = solution.removeNthFromEnd(head, 1);

        assertEquals(null, newHead);
    }

    @Test
    void example3() {
        // Input: head = [1,2], n = 2
        // Output: [2]

        RemoveNodeFromEndOfList.ListNode head = new RemoveNodeFromEndOfList.ListNode(1);
        head.next = new RemoveNodeFromEndOfList.ListNode(2);

        RemoveNodeFromEndOfList.ListNode newHead = solution.removeNthFromEnd(head, 2);

        assertEquals(2, newHead.val);
    }
}
