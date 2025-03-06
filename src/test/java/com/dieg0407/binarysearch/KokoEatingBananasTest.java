package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KokoEatingBananasTest {
    private final KokoEatingBananas solution = new KokoEatingBananas();

    @Test
    void example1() {
        int[] piles = { 1, 4, 3, 2 };
        int h = 9;
        var expected = 2;

        var result = solution.minEatingSpeed(piles, h);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] piles = { 25, 10, 23, 4 };
        int h = 4;
        var expected = 25;

        var result = solution.minEatingSpeed(piles, h);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[] piles = { 312884470 };
        int h = 968709470;
        var expected = 1;

        var result = solution.minEatingSpeed(piles, h);
        assertThat(result).isEqualTo(expected);
    }
}
