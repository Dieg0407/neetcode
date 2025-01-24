package com.dieg0407;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ContainsDuplicateTest {
    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void example1() {
        var nums = new int[] { 1, 2, 3, 3 };
        var answer = solution.hasDuplicate(nums);
        assertThat(answer).isTrue();
    }

    @Test
    void example2() {
        var nums = new int[] { 1, 2, 3, 4 };
        var answer = solution.hasDuplicate(nums);
        assertThat(answer).isFalse();
    }
}
