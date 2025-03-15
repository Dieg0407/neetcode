package com.dieg0407.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LRUCacheTest {

    @Test
    void example1() {
        final LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 10);
        assertThat(lRUCache.get(1)).isEqualTo(10);
        lRUCache.put(2, 20);
        lRUCache.put(3, 30);
        assertThat(lRUCache.get(2)).isEqualTo(20);
        assertThat(lRUCache.get(1)).isEqualTo(-1);
    }

    @Test
    void example2() {
        /**
         * ["LRUCache", [3], "put", [1, 1], "put", [2, 2], "put", [3, 3], "get", [1],
         * "get", [2], "get", [4], "put", [4, 4], "get", [1], "get", [2], "get", [3],
         * "get", [4], "get", [2], "put", [1, 8], "put", [3, 7], "get", [1], "get", [2],
         * "get", [3], "get", [4], "get", [5], "get", [2], "get", [3], "get", [4],
         * "put", [1,9], "put", [6,6], "get", [1], "get", [2], "get", [3], "get", [4],
         * "get", [5], "get", [6]]
         * 
         */
        final LRUCache lRUCache = new LRUCache(3);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        lRUCache.put(3, 3);
        assertThat(lRUCache.get(1)).isEqualTo(1);
        assertThat(lRUCache.get(2)).isEqualTo(2);
        assertThat(lRUCache.get(4)).isEqualTo(-1);
        lRUCache.put(4, 4);
        assertThat(lRUCache.get(1)).isEqualTo(1);
        assertThat(lRUCache.get(2)).isEqualTo(2);
        assertThat(lRUCache.get(3)).isEqualTo(-1);
        assertThat(lRUCache.get(4)).isEqualTo(4);
        assertThat(lRUCache.get(2)).isEqualTo(2);
        lRUCache.put(1, 8);
        lRUCache.put(3, 7);
        assertThat(lRUCache.get(1)).isEqualTo(8);
        assertThat(lRUCache.get(2)).isEqualTo(2);
        assertThat(lRUCache.get(3)).isEqualTo(7);
        assertThat(lRUCache.get(4)).isEqualTo(-1);
        assertThat(lRUCache.get(5)).isEqualTo(-1);
        assertThat(lRUCache.get(2)).isEqualTo(2);
        assertThat(lRUCache.get(3)).isEqualTo(7);
        assertThat(lRUCache.get(4)).isEqualTo(-1);
        lRUCache.put(1, 9);
        lRUCache.put(6, 6);
        assertThat(lRUCache.get(1)).isEqualTo(9);
        assertThat(lRUCache.get(2)).isEqualTo(-1);
        assertThat(lRUCache.get(3)).isEqualTo(7);
        assertThat(lRUCache.get(4)).isEqualTo(-1);
        assertThat(lRUCache.get(5)).isEqualTo(-1);
        assertThat(lRUCache.get(6)).isEqualTo(6);
    }
}
