package com.dieg0407.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void example1() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        head.next = new ReverseLinkedList.ListNode(2);
        head.next.next = new ReverseLinkedList.ListNode(3);
        head.next.next.next = new ReverseLinkedList.ListNode(4);
        head.next.next.next.next = new ReverseLinkedList.ListNode(5);

        ReverseLinkedList.ListNode reversed = new ReverseLinkedList().reverseList(head);

        assertEquals(5, reversed.val);
        assertEquals(4, reversed.next.val);
        assertEquals(3, reversed.next.next.val);
        assertEquals(2, reversed.next.next.next.val);
        assertEquals(1, reversed.next.next.next.next.val);
    }
}
