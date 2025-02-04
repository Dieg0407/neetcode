package com.dieg0407.twopointers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TwoIntegerSum2Test {

    private final TwoIntegerSum2 solution = new TwoIntegerSum2();

    @Test
    void example1() {
        int[] numbers = new int[] { 1, 2, 3, 4 };
        int target = 3;

        assertThat(solution.twoSum(numbers, target))
                .containsExactly(1, 2);
    }

}
