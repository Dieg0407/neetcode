package com.dieg0407.twopointers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void example1() {
        assertThat(solution.isPalindrome("Was it a car or a cat I saw?"))
                .isTrue();
    }

    @Test
    void example2() {
        assertThat(solution.isPalindrome("tab a cat"))
                .isFalse();
    }
}
