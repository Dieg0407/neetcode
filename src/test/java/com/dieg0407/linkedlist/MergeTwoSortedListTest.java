package com.dieg0407.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListTest {
    @Test
    void example1() {
        MergeTwoSortedList.ListNode list1 = new MergeTwoSortedList.ListNode(1);
        list1.next = new MergeTwoSortedList.ListNode(2);
        list1.next.next = new MergeTwoSortedList.ListNode(4);

        MergeTwoSortedList.ListNode list2 = new MergeTwoSortedList.ListNode(1);
        list2.next = new MergeTwoSortedList.ListNode(3);
        list2.next.next = new MergeTwoSortedList.ListNode(4);

        MergeTwoSortedList.ListNode merged = new MergeTwoSortedList().mergeTwoLists(list1, list2);

        assertEquals(1, merged.val);
        assertEquals(1, merged.next.val);
        assertEquals(2, merged.next.next.val);
        assertEquals(3, merged.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.next.val);
    }

}
