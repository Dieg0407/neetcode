package com.dieg0407.arraysandhashing;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        var hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], nums[i] + 1);
        }

        var maxCounter = 1;

        int pivot;
        int counter;
        while (!hashMap.isEmpty()) {
            pivot = hashMap.keySet().stream().findFirst().get();
            counter = 1;
            hashMap.remove(pivot);

            var forwarder = pivot + 1;
            while (hashMap.containsKey(forwarder)) {
                hashMap.remove(forwarder);
                counter++;
                forwarder++;
            }
            var backtracker = pivot - 1;
            while (hashMap.containsKey(backtracker)) {
                hashMap.remove(backtracker);
                counter++;
                backtracker--;
            }

            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }

        return maxCounter;
    }
}
