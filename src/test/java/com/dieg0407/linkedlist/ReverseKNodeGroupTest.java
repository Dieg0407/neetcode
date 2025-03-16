package com.dieg0407.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReverseKNodeGroupTest {
    private final ReverseKNodeGroup solution = new ReverseKNodeGroup();

    @Test
    void example1() {
        // Input: head = [1,2,3,4,5,6], k = 3
        // Output: [3,2,1,6,5,4]

        ReverseKNodeGroup.ListNode head = new ReverseKNodeGroup.ListNode(1);
        head.next = new ReverseKNodeGroup.ListNode(2);
        head.next.next = new ReverseKNodeGroup.ListNode(3);
        head.next.next.next = new ReverseKNodeGroup.ListNode(4);
        head.next.next.next.next = new ReverseKNodeGroup.ListNode(5);
        head.next.next.next.next.next = new ReverseKNodeGroup.ListNode(6);

        ReverseKNodeGroup.ListNode result = solution.reverseKGroup(head, 3);
        assertThat(result.val).isEqualTo(3);
        assertThat(result.next.val).isEqualTo(2);
        assertThat(result.next.next.val).isEqualTo(1);
        assertThat(result.next.next.next.val).isEqualTo(6);
        assertThat(result.next.next.next.next.val).isEqualTo(5);
        assertThat(result.next.next.next.next.next.val).isEqualTo(4);
    }

    @Test
    void example2() {
        // head = [1,2,3,4,5], k = 3
        // Output: [3,2,1,4,5]

        ReverseKNodeGroup.ListNode head = new ReverseKNodeGroup.ListNode(1);
        head.next = new ReverseKNodeGroup.ListNode(2);
        head.next.next = new ReverseKNodeGroup.ListNode(3);
        head.next.next.next = new ReverseKNodeGroup.ListNode(4);
        head.next.next.next.next = new ReverseKNodeGroup.ListNode(5);

        ReverseKNodeGroup.ListNode result = solution.reverseKGroup(head, 3);
        assertThat(result.val).isEqualTo(3);
        assertThat(result.next.val).isEqualTo(2);
        assertThat(result.next.next.val).isEqualTo(1);
        assertThat(result.next.next.next.val).isEqualTo(4);
        assertThat(result.next.next.next.next.val).isEqualTo(5);
    }

}
