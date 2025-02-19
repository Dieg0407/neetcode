package com.dieg0407.stack;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GenerateParenthesisTest {

    private final GenerateParenthesis solution = new GenerateParenthesis();

    @Test
    void example1() {
        int n = 3;
        assertThat(solution.generateParenthesis(n))
                .containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())",
                        "()()()");
    }

    @Test
    void example2() {
        int n = 2;
        assertThat(solution.generateParenthesis(n))
                .containsExactlyInAnyOrder("()()", "(())");
    }

    @Test
    void example3() {
        int n = 1;
        assertThat(solution.generateParenthesis(n))
                .containsExactlyInAnyOrder("()");
    }
}
