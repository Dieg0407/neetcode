package com.dieg0407.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingTest {
    private final LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();

    @Test
    void example1() {
        var s = "zxyzxyz";
        var expected = 3;

        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        var s = "xxxx";
        var expected = 1;

        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example3() {
        var s = "pwwkew";
        var expected = 3;

        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example4() {
        var s = "dvdf";
        var expected = 3;

        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }
}
