package com.dieg0407.arraysandhashing;

import java.util.HashMap;

/**
 * ref: https://neetcode.io/problems/duplicate-integer
 */
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        var hashTable = new HashMap<Integer, Void>();
        for (var i : nums) {
            if (hashTable.containsKey(i)) {
                return true;
            }
            hashTable.put(i, null);
        }
        return false;
    }
}
