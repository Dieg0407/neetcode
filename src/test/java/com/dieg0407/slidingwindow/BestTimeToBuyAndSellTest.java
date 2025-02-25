package com.dieg0407.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellTest {
    private final BestTimeToBuyAndSell solution = new BestTimeToBuyAndSell();

    @Test
    void example1() {
        int[] prices = { 10, 1, 5, 6, 7, 1 };
        var expected = 6;

        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] prices = { 10, 8, 7, 5, 2 };
        var expected = 0;

        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }
}
