package com.dieg0407.stack;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarFleetTest {
    private final CarFleet solution = new CarFleet();

    @Test
    void example1() {
        int target = 10;
        int[] position = { 1, 4 };
        int[] speed = { 3, 2 };

        assertThat(solution.carFleet(target, position, speed)).isEqualTo(1);
    }

    @Test
    void example2() {
        int target = 10;
        int[] position = { 4, 1, 0, 7 };
        int[] speed = { 2, 2, 1, 1 };

        assertThat(solution.carFleet(target, position, speed)).isEqualTo(3);
    }
}
