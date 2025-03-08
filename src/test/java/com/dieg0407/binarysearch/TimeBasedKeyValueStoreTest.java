package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeBasedKeyValueStoreTest {
    private final TimeBasedKeyValueStore solution = new TimeBasedKeyValueStore();

    @Test
    void example1() {
        solution.set("alice", "happy", 1);
        assertThat(solution.get("alice", 1)).isEqualTo("happy");
        assertThat(solution.get("alice", 2)).isEqualTo("happy");
        solution.set("alice", "sad", 3);
        assertThat(solution.get("alice", 3)).isEqualTo("sad");

    }

}
