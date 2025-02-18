package com.dieg0407.stack;

import java.util.Set;
import java.util.Stack;

public class EvalReversePolishNotation {
    private final Set<String> operators = Set.of("+", "-", "*", "/");

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        final var stack = new Stack<Integer>();
        for (final var token : tokens) {
            if (operators.contains(token)) {
                final var b = stack.pop();
                final var a = stack.pop();
                stack.push(operate(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private int operate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return a / b;
        }

    }
}
