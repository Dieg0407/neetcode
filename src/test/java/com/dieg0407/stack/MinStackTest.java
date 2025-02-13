package com.dieg0407.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinStackTest {
    private final MinStack solution = new MinStack();

    @Test
    void example1() {
        solution.push(-2);
        solution.push(0);
        solution.push(-3);
        assertThat(solution.getMin()).isEqualTo(-3);
        solution.pop();
        assertThat(solution.top()).isEqualTo(0);
        assertThat(solution.getMin()).isEqualTo(-2);
    }

    @Test
    void example2() {
        solution.push(-100);
        solution.push(-200);
        solution.push(-300);
        solution.push(-400);
        assertThat(solution.getMin()).isEqualTo(-400);
        solution.pop();
        assertThat(solution.top()).isEqualTo(-300);
        solution.pop();
        assertThat(solution.getMin()).isEqualTo(-200);
    }
}
