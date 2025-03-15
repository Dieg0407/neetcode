package com.dieg0407.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final Map<Integer, Node> cache;
    private final int capacity;
    private Node head = null;
    private Node tail = null;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        orderNode(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;

            orderNode(node);

            return;
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        cache.put(key, node);

        if (cache.size() <= capacity) {
            return;
        }

        cache.remove(head.key);
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

    }

    private void orderNode(Node node) {
        if (node == head && head == tail) {
            return;
        }
        if (node == tail) {
            return;
        }

        if (node == head) {
            head = node.next;
            head.prev = null;

            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public static class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

}
