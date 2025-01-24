package com.dieg0407;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TwoSumTest {
    private final TwoSum solution = new TwoSum();

    @Test
    void example1() {
        var nums = new int[] { 3, 4, 5, 6 };
        var target = 7;

        assertThat(solution.twoSum(nums, target))
                .containsSequence(0, 1);
    }

    @Test
    void example2() {
        var nums = new int[] { 4, 5, 6 };
        var target = 10;

        assertThat(solution.twoSum(nums, target))
                .containsSequence(0, 2);
    }

    @Test
    void example3() {
        var nums = new int[] { 5, 5 };
        var target = 10;

        assertThat(solution.twoSum(nums, target))
                .containsSequence(0, 1);
    }
}
