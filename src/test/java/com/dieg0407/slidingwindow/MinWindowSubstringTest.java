package com.dieg0407.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinWindowSubstringTest {
    private final MinWindowSubstring solution = new MinWindowSubstring();

    @Test
    void example1() {
        var s = "ADOBBECODEBANC";
        var t = "ABC";

        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo("BANC");
    }

    @Test
    void example2() {
        var s = "OUZODYXAZV";
        var t = "XYZ";

        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo("YXAZ");
    }

    @Test
    void example3() {
        var s = "xyz";
        var t = "xyz";

        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo("xyz");
    }

    @Test
    void example4() {
        var s = "x";
        var t = "xy";

        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo("");
    }

    @Test
    void example5() {
        var s = "ab";
        var t = "b";

        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo("b");
    }

}
