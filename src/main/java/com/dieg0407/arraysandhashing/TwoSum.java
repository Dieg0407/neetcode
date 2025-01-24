package com.dieg0407.arraysandhashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // complement, position
        var hashTable = new HashMap<Integer, Integer>();

        hashTable.put(target - nums[0], 0);
        for (var i = 1; i < nums.length; i++) {
            if (!hashTable.containsKey(nums[i])) {
                hashTable.put(target - nums[i], i);
                continue;
            }

            return new int[] { hashTable.get(nums[i]), i };
        }

        return new int[] {};
    }
}
