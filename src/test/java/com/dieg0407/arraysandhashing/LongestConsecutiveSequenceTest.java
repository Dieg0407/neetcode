package com.dieg0407.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    @Test
    void example1() {
        var nums = new int[] { 2, 20, 4, 10, 3, 4, 5 };

        assertThat(solution.longestConsecutive(nums)).isEqualTo(4);
    }

    @Test
    void example2() {
        var nums = new int[] { 0, 3, 2, 5, 4, 6, 1, 1 };
        assertThat(solution.longestConsecutive(nums)).isEqualTo(7);
    }
}
