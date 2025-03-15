package com.dieg0407.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MergeKListsTest {
    private final MergeKLists solution = new MergeKLists();

    @Test
    void example1() {
        // Input: lists = [[1,2,4],[1,3,5],[3,6]]
        // Output: [1,1,2,3,3,4,5,6]
        MergeKLists.ListNode[] lists = new MergeKLists.ListNode[3];
        lists[0] = new MergeKLists.ListNode(1, new MergeKLists.ListNode(2, new MergeKLists.ListNode(4)));
        lists[1] = new MergeKLists.ListNode(1, new MergeKLists.ListNode(3, new MergeKLists.ListNode(5)));
        lists[2] = new MergeKLists.ListNode(3, new MergeKLists.ListNode(6));

        MergeKLists.ListNode result = solution.mergeKLists(lists);
        assertThat(result.val).isEqualTo(1);
        assertThat(result.next.val).isEqualTo(1);
        assertThat(result.next.next.val).isEqualTo(2);
        assertThat(result.next.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.next.next.val).isEqualTo(4);
        assertThat(result.next.next.next.next.next.next.val).isEqualTo(5);
        assertThat(result.next.next.next.next.next.next.next.val).isEqualTo(6);

    }
}
