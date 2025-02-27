package com.dieg0407.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterTest {
    private final LongestRepeatingCharacter solution = new LongestRepeatingCharacter();

    @Test
    void example1() {
        var s = "XYYX";
        int k = 2;

        assertThat(solution.characterReplacement(s, k)).isEqualTo(4);
    }

    @Test
    void example2() {
        var s = "AAABABB";
        int k = 1;

        assertThat(solution.characterReplacement(s, k)).isEqualTo(5);
    }
}
