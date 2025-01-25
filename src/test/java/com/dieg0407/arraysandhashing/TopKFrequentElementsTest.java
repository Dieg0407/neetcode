package com.dieg0407.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TopKFrequentElementsTest {
    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void example1() {
        var nums = new int[] { 1, 2, 2, 3, 3, 3 };
        var k = 2;

        assertThat(solution.topKFrequent(nums, k))
                .containsExactlyInAnyOrder(2, 3);
    }

    @Test
    void example2() {
        var nums = new int[] { 7, 7 };
        var k = 1;

        assertThat(solution.topKFrequent(nums, k))
                .containsExactlyInAnyOrder(7);
    }
}
