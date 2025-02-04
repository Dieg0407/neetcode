package com.dieg0407.twopointers;

/**
 * ref: https://neetcode.io/problems/two-integer-sum-ii
 */
public class TwoIntegerSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int sum = numbers[left] + numbers[right];
        while (target != sum) {
            if (sum > target) {
                right--;
            } else {
                left++;
            }
            sum = numbers[left] + numbers[right];
        }
        return new int[] { left + 1, right + 1 };
    }
}
