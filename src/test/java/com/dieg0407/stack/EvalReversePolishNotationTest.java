package com.dieg0407.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvalReversePolishNotationTest {
    private final EvalReversePolishNotation solution = new EvalReversePolishNotation();

    @Test
    void example1() {
        final var tokens = new String[] { "2", "1", "+", "3", "*" };
        final var expected = 9;
        final var actual = solution.evalRPN(tokens);

        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        final var tokens = new String[] { "1", "2", "+", "3", "*", "4", "-" };
        final var expected = 5;
        final var actual = solution.evalRPN(tokens);

        assertEquals(expected, actual);
    }
}
