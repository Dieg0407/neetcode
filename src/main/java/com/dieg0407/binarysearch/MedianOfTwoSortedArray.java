package com.dieg0407.binarysearch;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // edge cases
        // one array may or may not be empty
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        if (nums1.length == 0) {
            return findMedianSortedArrays(nums2);
        }
        if (nums2.length == 0) {
            return findMedianSortedArrays(nums1);
        }
        // they are sorted already
        if (nums1[nums1.length - 1] <= nums2[0]) {
            return findMedianOfAlreadySortedArrays(nums1, nums2);
        }
        if (nums2[nums2.length - 1] <= nums1[0]) {
            return findMedianOfAlreadySortedArrays(nums2, nums1);
        }

        // implement binary search
        int[] ref;
        if (nums1.length > nums2.length) {
            ref = nums1;
            nums1 = nums2;
            nums2 = ref;
        }

        int left = 0, right = nums1.length - 1, halfTotal = (nums1.length + nums2.length) / 2;
        int mod = (nums1.length + nums2.length) % 2;
        do {
            int partitionNums1 = ((left + right) / 2);
            int partitionNums2 = halfTotal - (partitionNums1 + 1) - 1;

            // validate the partitions
            // found the partition
            if (nums1[partitionNums1] <= nums2[partitionNums2 + 1] &&
                    nums2[partitionNums2] <= nums1[partitionNums1 + 1]) {
                if (mod != 0) {
                    return Math.min(nums1[partitionNums1 + 1], nums2[partitionNums2 + 1]);
                }

                return (Math.max(nums1[partitionNums1], nums2[partitionNums2]) +
                        Math.min(nums1[partitionNums1 + 1], nums2[partitionNums2 + 1])) / 2.0;
            }

            // move the partition
            if (nums1[partitionNums1] > nums2[partitionNums2 + 1]) {
                right = partitionNums1;
            } else {
                left = partitionNums1 + 1;
            }
        } while (left < right);

        if (left == 0) {
            if (mod != 0) {
                return Math.min(nums1[0], nums2[halfTotal]);
            }

            return (nums2[halfTotal - 1] + Math.min(nums1[0], nums2[halfTotal])) / 2.0;
        }

        int totalNums2 = halfTotal - nums1.length;
        if (mod != 0) {
            return nums2[totalNums2];
        }

        return (Math.max(nums1[left], nums2[totalNums2 - 1]) + nums2[totalNums2]) / 2.0;
    }

    private double findMedianSortedArrays(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }

    private double findMedianOfAlreadySortedArrays(int[] leftSide, int[] rightSide) {
        int total = leftSide.length + rightSide.length;

        if (total % 2 != 0) {
            int half = total / 2;
            if (leftSide.length > half) {
                return leftSide[half];
            }
            return rightSide[half - leftSide.length];
        }

        int right = total / 2, rightValue = -1;
        int left = right - 1, leftValue = -1;

        if (leftSide.length > left) {
            leftValue = leftSide[left];
        } else {
            leftValue = rightSide[left - leftSide.length];
        }
        if (leftSide.length > right) {
            rightValue = leftSide[right];
        } else {
            rightValue = rightSide[right - leftSide.length];
        }

        return (leftValue + rightValue) / 2.0;
    }
}
