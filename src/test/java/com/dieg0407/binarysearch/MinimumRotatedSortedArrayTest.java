package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumRotatedSortedArrayTest {
    private final MinimumRotatedSortedArray solution = new MinimumRotatedSortedArray();

    @Test
    void example1() {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        var expected = 1;

        var result = solution.findMin(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] nums = { 4, 5, 0, 1, 2, 3 };
        var expected = 0;

        var result = solution.findMin(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[] nums = { 4, 5, 6, 7 };
        var expected = 4;

        var result = solution.findMin(nums);
        assertThat(result).isEqualTo(expected);
    }

}
