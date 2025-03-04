package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private final BinarySearch solution = new BinarySearch();

    @Test
    void example1() {
        int[] nums = { -1, 0, 2, 4, 6, 8 };
        int target = 4;
        int expected = 3;

        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] nums = { -1, 0, 2, 4, 6, 8 };
        int target = 3;
        int expected = -1;

        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
