package com.dieg0407.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReorderLinkedListTest {
    private final ReorderLinkedList solution = new ReorderLinkedList();

    @Test
    void example1() {
        // head = [2,4,6,8]
        // output [2,8,4,6]

        ReorderLinkedList.ListNode head = new ReorderLinkedList.ListNode(2);
        head.next = new ReorderLinkedList.ListNode(4);
        head.next.next = new ReorderLinkedList.ListNode(6);
        head.next.next.next = new ReorderLinkedList.ListNode(8);

        solution.reorderList(head);

        assertEquals(2, head.val);
        assertEquals(8, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(6, head.next.next.next.val);
    }

    @Test
    void example2() {
        // head [2,4,6,8,10]
        // output [2,10,4,8,6]

        ReorderLinkedList.ListNode head = new ReorderLinkedList.ListNode(2);
        head.next = new ReorderLinkedList.ListNode(4);
        head.next.next = new ReorderLinkedList.ListNode(6);
        head.next.next.next = new ReorderLinkedList.ListNode(8);

        solution.reorderList(head);

        assertEquals(2, head.val);
        assertEquals(8, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(6, head.next.next.next.val);
    }
}
