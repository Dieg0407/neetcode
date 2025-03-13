package com.dieg0407.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class CopyLinkedListWithRandomPointerTest {
    private final CopyLinkedListWithRandomPointer solution = new CopyLinkedListWithRandomPointer();

    @Test
    void example1() {
        // Input: head = [[3,null],[7,3],[4,0],[5,1]]
        // Output: [[3,null],[7,3],[4,0],[5,1]]

        CopyLinkedListWithRandomPointer.Node head = new CopyLinkedListWithRandomPointer.Node(3);
        head.next = new CopyLinkedListWithRandomPointer.Node(7);
        head.next.next = new CopyLinkedListWithRandomPointer.Node(4);
        head.next.next.next = new CopyLinkedListWithRandomPointer.Node(5);

        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        CopyLinkedListWithRandomPointer.Node newHead = solution.copyRandomList(head);
        assertNotEquals(head, newHead);
        assertNotEquals(head.next, newHead.next);
        assertNotEquals(head.next.next, newHead.next.next);
        assertNotEquals(head.next.next.next, newHead.next.next.next);
        assertEquals(head.val, newHead.val);
        assertEquals(head.next.val, newHead.next.val);
        assertEquals(head.next.next.val, newHead.next.next.val);
        assertEquals(head.next.next.next.val, newHead.next.next.next.val);

        if (head.random == null) {
            assertThat(newHead.random).isNull();
        } else {
            assertNotEquals(head.random, newHead.random);
            assertEquals(head.random.val, head.random.val);
        }
        if (head.next.random == null) {
            assertThat(newHead.next.random).isNull();
        } else {
            assertNotEquals(head.next.random, newHead.next.random);
            assertEquals(head.next.random.val, newHead.next.random.val);
        }
        if (head.next.next.random == null) {
            assertThat(newHead.next.next.random).isNull();
        } else {
            assertNotEquals(head.next.next.random, newHead.next.next.random);
            assertEquals(head.next.next.random.val, newHead.next.next.random.val);
        }
        if (head.next.next.next.random == null) {
            assertThat(newHead.next.next.next.random).isNull();
        } else {
            assertNotEquals(head.next.next.next.random, newHead.next.next.next.random);
            assertEquals(head.next.next.next.random.val, newHead.next.next.next.random.val);
        }
    }

    @Test
    void example2() {
        // head=[[3,null],[3,0],[3,null]]
        // Output: [[3,null],[3,0],[3,null]]

        CopyLinkedListWithRandomPointer.Node head = new CopyLinkedListWithRandomPointer.Node(3);
        head.next = new CopyLinkedListWithRandomPointer.Node(3);
        head.next.next = new CopyLinkedListWithRandomPointer.Node(3);

        head.random = null;
        head.next.random = head;
        head.next.next.random = null;

        CopyLinkedListWithRandomPointer.Node newHead = solution.copyRandomList(head);
        assertNotEquals(head, newHead);
        assertNotEquals(head.next, newHead.next);
        assertNotEquals(head.next.next, newHead.next.next);

        assertEquals(head.val, newHead.val);
        assertEquals(head.next.val, newHead.next.val);
        assertEquals(head.next.next.val, newHead.next.next.val);

        if (head.random == null) {
            assertThat(newHead.random).isNull();
        } else {
            assertNotEquals(head.random, newHead.random);
            assertEquals(head.random.val, head.random.val);
        }

        if (head.next.random == null) {
            assertThat(newHead.next.random).isNull();
        } else {
            assertNotEquals(head.next.random, newHead.next.random);
            assertEquals(head.next.random.val, newHead.next.random.val);
        }

        if (head.next.next.random == null) {
            assertThat(newHead.next.next.random).isNull();
        } else {
            assertNotEquals(head.next.next.random, newHead.next.next.random);
            assertEquals(head.next.next.random.val, newHead.next.next.random.val);
        }
    }
}
