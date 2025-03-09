package com.dieg0407.binarysearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArrayTest {
    private final MedianOfTwoSortedArray solution = new MedianOfTwoSortedArray();

    @Test
    void example1() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3 };
        double expected = 2.0;

        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example2() {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 4 };
        double expected = 2.5;

        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example3() {
        int[] nums1 = { 1, 2, 3, 4, 5, 9, 10 };
        int[] nums2 = { 7, 8 };
        double expected = 5.0;

        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example4() {
        int[] nums1 = { 1, 4, 5, 9, 10, 11 };
        int[] nums2 = { 2, 3 };
        double expected = 4.5;

        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void example5() {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        double expected = 2.0;
        assertThat(solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(expected);
    }
}
