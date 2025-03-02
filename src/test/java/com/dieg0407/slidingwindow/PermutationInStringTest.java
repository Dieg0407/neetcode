package com.dieg0407.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermutationInStringTest {

    private final PermutationInString solution = new PermutationInString();

    @Test
    void example1() {
        var s1 = "abc";
        var s2 = "lacabee";

        boolean result = solution.checkInclusion(s1, s2);
        assertThat(result).isTrue();
    }

    @Test
    void example2() {
        var s1 = "ab";
        var s2 = "eidbaooo";

        boolean result = solution.checkInclusion(s1, s2);
        assertThat(result).isTrue();
    }

    @Test
    void example3() {
        var s1 = "abc";
        var s2 = "lecaabee";

        boolean result = solution.checkInclusion(s1, s2);
        assertThat(result).isFalse();
    }

    @Test
    void example4() {
        var s1 = "ab";
        var s2 = "eidboaoo";

        boolean result = solution.checkInclusion(s1, s2);
        assertThat(result).isFalse();
    }
}
