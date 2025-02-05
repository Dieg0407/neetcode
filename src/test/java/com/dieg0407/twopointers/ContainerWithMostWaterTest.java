package com.dieg0407.twopointers;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    void example1() {
        int[] heights = { 1, 7, 2, 5, 4, 7, 3, 6 };
        int expected = 36;

        assertThat(solution.maxArea(heights)).isEqualTo(expected);

    }

    @Test
    void example2() {
        int[] heights = { 2, 2, 2 };
        int expected = 4;

        assertThat(solution.maxArea(heights)).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[] heights = { 1, 7, 2, 5, 12, 3, 500, 500, 7, 8, 4, 7, 3 };
        int expected = 500;

        assertThat(solution.maxArea(heights)).isEqualTo(expected);
    }
}
