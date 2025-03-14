package com.dieg0407.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindDuplicateNumberTest {
    private final FindDuplicateNumber solution = new FindDuplicateNumber();

    @Test
    void example1() {
        // Input: nums = [1,2,3,2,2]
        // Output: 2
        int result = solution.findDuplicate(new int[] { 1, 2, 3, 2, 2 });
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,3,4,4]
        // Output: 4
        int result = solution.findDuplicate(new int[] { 1, 2, 3, 4, 4 });
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example3() {
        // nums=[1,3,4,2,2]
        // Output: 2
        int result = solution.findDuplicate(new int[] { 1, 3, 4, 2, 2 });
        assertThat(result).isEqualTo(2);
    }
}
