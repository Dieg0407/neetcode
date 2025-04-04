package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInRotatedArrayTest {
    private final SearchInRotatedArray solution = new SearchInRotatedArray();

    @Test
    void example1() {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int target = 1;
        int expected = 4;

        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] nums = { 3, 5, 6, 0, 1, 2 };
        int target = 4;
        int expected = -1;

        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[] nums = { 3, 1 };
        int target = 1;
        int expected = 1;

        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void example4() {
        int[] nums = { 5, 1, 2, 3, 4 };
        int target = 1;
        int expected = 1;

        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
