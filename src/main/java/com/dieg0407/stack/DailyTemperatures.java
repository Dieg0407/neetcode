package com.dieg0407.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 0) {
            return new int[] {};
        }

        final int length = temperatures.length;
        final int[] result = new int[length];
        final Stack<Tuple> monotonicStack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            final var currentTempoerature = new Tuple(i, temperatures[i]);

            while (!monotonicStack.isEmpty() && !monotonicStack.peek().isHigherThan(currentTempoerature)) {
                monotonicStack.pop();
            }

            if (monotonicStack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = monotonicStack.peek().index - i;
            }
            monotonicStack.push(currentTempoerature);
        }

        return result;
    }

    record Tuple(int index, int temperature) {
        public boolean isHigherThan(Tuple tuple) {
            return this.temperature > tuple.temperature;
        }
    }
}
