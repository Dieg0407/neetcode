package com.dieg0407.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidParenthesisTest {
    private final ValidParenthesis solution = new ValidParenthesis();

    @Test
    void example1() {
        var s = "()";
        assertThat(solution.isValid(s)).isTrue();
    }

    @Test
    void example2() {
        var s = "([{}])";
        assertThat(solution.isValid(s)).isTrue();
    }

    @Test
    void example3() {
        var s = "([)]";
        assertThat(solution.isValid(s)).isFalse();
    }
}
