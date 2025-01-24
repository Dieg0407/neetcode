package com.dieg0407;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void example1() {
        var answer = solution.isAnagram("racecar", "carrace");
        assertThat(answer).isTrue();
    }

    @Test
    void example2() {
        var answer = solution.isAnagram("jar", "jam");
        assertThat(answer).isFalse();
    }
}
