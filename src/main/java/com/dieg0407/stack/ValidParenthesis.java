package com.dieg0407.stack;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    private static final Map<Character, Character> MAP = Map.of(
            '(', ')',
            '{', '}',
            '[', ']');

    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (var i = 0; i < s.length(); i++) {
            var character = s.charAt(i);
            if (MAP.keySet().contains(character)) {
                stack.push(character);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            var top = stack.pop();
            if (MAP.get(top) != character) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
