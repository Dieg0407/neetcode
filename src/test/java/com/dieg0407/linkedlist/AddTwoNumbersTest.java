package com.dieg0407.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    private final AddTwoNumbers solution = new AddTwoNumbers();

    @Test
    void example1() {
        // Input: l1 = [1,2,3], l2 = [4,5,6]
        // Output: [5,7,9]

        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(1);
        l1.next = new AddTwoNumbers.ListNode(2);
        l1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(4);
        l2.next = new AddTwoNumbers.ListNode(5);
        l2.next.next = new AddTwoNumbers.ListNode(6);

        AddTwoNumbers.ListNode expected = solution.addTwoNumbers(l1, l2);
        assertThat(expected).isNotNull().extracting(tmp -> tmp.val).isEqualTo(5);
        assertThat(expected.next).isNotNull().extracting(tmp -> tmp.val).isEqualTo(7);
        assertThat(expected.next.next).isNotNull().extracting(tmp -> tmp.val).isEqualTo(9);
    }

    @Test
    void example2() {
        // Input: l1 = [9], l2 = [9]
        // Output: [8,1]

        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(9);

        AddTwoNumbers.ListNode expected = solution.addTwoNumbers(l1, l2);
        assertThat(expected).isNotNull().extracting(tmp -> tmp.val).isEqualTo(8);
        assertThat(expected.next).isNotNull().extracting(tmp -> tmp.val).isEqualTo(1);

    }
}
