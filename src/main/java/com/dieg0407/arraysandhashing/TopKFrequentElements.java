package com.dieg0407.arraysandhashing;

import java.util.HashMap;

/**
 * ref: https://neetcode.io/problems/top-k-elements-in-list
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        var hashMap = new HashMap<Integer, Integer>();

        for (var num : nums) {
            hashMap.putIfAbsent(num, 0);
            hashMap.put(num, hashMap.get(num) + 1);
        }

        return hashMap.entrySet().stream()
                .map(set -> new int[] { set.getKey(), set.getValue() })
                .sorted((a, b) -> b[1] - a[1])
                .map(arr -> arr[0])
                .toList()
                .subList(0, k)
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
