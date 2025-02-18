package com.dieg0407.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        final List<String> values = new ArrayList<>();
        backtrack(values, "", 0, 0, n);

        return values;
    }

    private void backtrack(List<String> values, String prefix, int open, int close, int max) {
        if (open == max && close == max) {
            values.add(prefix);
            return;
        }

        if (open <= close) {
            backtrack(values, prefix + "(", open + 1, close, max);
        } else {
            if (open < max) {
                backtrack(values, prefix + "(", open + 1, close, max);
            }
            backtrack(values, prefix + ")", open, close + 1, max);
        }
    }
}
