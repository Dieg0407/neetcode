package com.dieg0407.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestRectangleInHistogramTest {
    private final LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    @Test
    void example1() {
        int[] heights = { 7, 1, 7, 2, 2, 4 };
        int expected = 8;

        assertThat(solution.largestRectangleArea(heights)).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] heights = { 1, 3, 7 };
        int expected = 7;

        assertThat(solution.largestRectangleArea(heights)).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[] heights = { 4, 3, 2, 1 };
        int expected = 6;

        assertThat(solution.largestRectangleArea(heights)).isEqualTo(expected);
    }

}
