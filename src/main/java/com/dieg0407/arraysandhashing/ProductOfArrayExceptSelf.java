package com.dieg0407.arraysandhashing;

import java.util.Arrays;

/**
 * ref: https://neetcode.io/problems/products-of-array-discluding-self
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        int zeroCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCounter++;
                continue;
            }
            result *= nums[i];
        }

        final var r = result;
        // more than one 0 means that the result will always be 0
        if (zeroCounter > 1) {
            return Arrays.stream(nums)
                    .map(num -> 0)
                    .toArray();
        }
        // one zero means that the '0' will return the total product
        if (zeroCounter == 1) {
            return Arrays.stream(nums)
                    .map(num -> num == 0 ? r : 0)
                    .toArray();
        }

        // no zeros
        return Arrays.stream(nums)
                .map(num -> r / num)
                .toArray();
    }
}
