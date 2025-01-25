package com.dieg0407.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    void example1() {
        var nums = new int[] { 1, 2, 4, 6 };
        assertThat(solution.productExceptSelf(nums))
                .containsExactly(48, 24, 12, 8);
    }

    @Test
    void example2() {
        var nums = new int[] { -1, 0, 1, 2, 3 };
        assertThat(solution.productExceptSelf(nums))
                .containsExactly(0, -6, 0, 0, 0);
    }
}
