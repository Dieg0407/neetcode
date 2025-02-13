package com.dieg0407.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrappingRainWaterTest {
    private final TrappingRainWater solution = new TrappingRainWater();

    @Test
    void example1() {
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };
        var expected = 9;

        assertThat(solution.trap(height)).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        var expected = 6;

        assertThat(solution.trap(heights)).isEqualTo(expected);
    }
}
