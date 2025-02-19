package com.dieg0407.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DailyTemperatureTest {

    private final DailyTemperatures solution = new DailyTemperatures();

    @Test
    void example1() {
        int[] temperatures = new int[] { 30, 38, 30, 36, 35, 40, 28 };
        int[] expected = new int[] { 1, 4, 1, 2, 1, 0, 0 };

        assertThat(solution.dailyTemperatures(temperatures)).containsExactly(expected);
    }

    @Test
    void example2() {
        int[] temperatures = new int[] { 22, 21, 20 };
        int[] expected = new int[] { 0, 0, 0 };

        assertThat(solution.dailyTemperatures(temperatures)).containsExactly(expected);
    }
}
