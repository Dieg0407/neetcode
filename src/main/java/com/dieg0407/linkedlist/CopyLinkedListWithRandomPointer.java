package com.dieg0407.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyLinkedListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        final Map<Integer, Node> indexToRandomMap = new HashMap<>();
        final Map<Node, Node> oldToNewMap = new HashMap<>();

        Node newHead = new Node(head.val);

        Node current = head;
        Node newCurrent = newHead;

        indexToRandomMap.put(0, current.random);
        oldToNewMap.put(current, newCurrent);

        int i = 1;
        while (current.next != null) {
            Node newNext = new Node(current.next.val);
            newCurrent.next = newNext;

            current = current.next;
            newCurrent = newNext;

            indexToRandomMap.put(i++, current.random);
            oldToNewMap.put(current, newCurrent);
        }

        newCurrent = newHead;
        i = 0;

        while (newCurrent != null) {
            if (indexToRandomMap.get(i) != null) {
                newCurrent.random = oldToNewMap.get(indexToRandomMap.get(i));
            }

            newCurrent = newCurrent.next;
            i++;
        }

        return newHead;
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
