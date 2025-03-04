package com.dieg0407.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum solution = new SlidingWindowMaximum();

    @Test
    void example1() {
        int[] nums = { 1, 2, 1, 0, 4, 2, 6 };
        int k = 3;
        int[] expected = { 2, 2, 4, 4, 6 };

        var result = solution.maxSlidingWindow(nums, k);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void example2() {
        int[] nums = { 1 };
        int k = 1;
        int[] expected = { 1 };

        var result = solution.maxSlidingWindow(nums, k);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void example3() {
        int[] nums = { -7, -8, 7, 5, 7, 1, 6, 0 };
        int k = 4;
        int[] expected = { 7, 7, 7, 7, 7 };

        var result = solution.maxSlidingWindow(nums, k);
        assertThat(result).containsExactly(expected);
    }

}
