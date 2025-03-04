package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Search2DMatrixTest {
    private final Search2DMatrix solution = new Search2DMatrix();

    @Test
    void example1() {
        int[][] matrix = {
                { 1, 2, 4, 8 },
                { 10, 11, 12, 13 },
                { 14, 20, 30, 40 }
        };
        int target = 10;
        boolean expected = true;

        var result = solution.searchMatrix(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[][] matrix = {
                { 1, 2, 4, 8 },
                { 10, 11, 12, 13 },
                { 14, 20, 30, 40 }
        };
        int target = 15;
        boolean expected = false;

        var result = solution.searchMatrix(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;
        boolean expected = true;

        var result = solution.searchMatrix(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example4() {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 }
        };
        int target = 11;
        boolean expected = true;

        var result = solution.searchMatrix(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example5() {
        int[][] matrix = {
                { 1 },
                { 3 }
        };
        int target = 3;
        boolean expected = true;

        var result = solution.searchMatrix(matrix, target);
        assertThat(result).isEqualTo(expected);
    }
}
