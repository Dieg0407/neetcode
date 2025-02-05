package com.dieg0407.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * ref: https://neetcode.io/problems/three-integer-sum
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        var ret = new HashSet<List<Integer>>();
        var i = 0;

        while (nums[i] <= 0 && i < nums.length - 2) {

            var complement = -nums[i];
            var twoSum = twoSum(complement, nums, i + 1);

            if (twoSum.size() == 0) {
                i++;
                continue;
            }

            for (var pair : twoSum) {
                var triplet = new ArrayList<Integer>();
                triplet.add(nums[i]);
                triplet.addAll(pair);

                ret.add(triplet);
            }
            i++;
        }

        return ret.stream().toList();
    }

    private List<List<Integer>> twoSum(int target, int nums[], int startFrom) {
        var ret = new ArrayList<List<Integer>>();

        int left = startFrom;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                ret.add(Arrays.asList(nums[left], nums[right]));

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return ret;
    }
}
