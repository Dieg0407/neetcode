package com.dieg0407.binarysearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 1) {
            return search(matrix[0], target);
        }

        int left = 0, right = matrix.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            int[] midRow = matrix[mid];
            int topMidRow = midRow[0];

            if (topMidRow == target) {
                return true;
            }

            if (target > topMidRow) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        if (target == matrix[right][0] || target == matrix[left][0]) {
            return true;
        }
        if (target > matrix[right][0]) {
            return search(matrix[right], target);
        }

        return search(matrix[left], target);
    }

    private boolean search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? true : false;
        }

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = nums[mid];

            if (midValue == target) {
                return true;
            }

            if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
