package com.dieg0407.twopointers;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class ThreeSumTest {
    private final ThreeSum solution = new ThreeSum();

    @Test
    void example1() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        var expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1));

        var result = solution.threeSum(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example2() {
        int[] nums = { 0, 0, 0 };
        var expected = Arrays.asList(Arrays.asList(0, 0, 0));

        var result = solution.threeSum(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example3() {
        int[] nums = { 0, 0, 0, 0 };
        var expected = Arrays.asList(Arrays.asList(0, 0, 0));

        var result = solution.threeSum(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example4() {
        int[] nums = { -2, 0, 1, 1, 2 };
        var expected = Arrays.asList(Arrays.asList(-2, 0, 2), Arrays.asList(-2, 1, 1));

        var result = solution.threeSum(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }
}
