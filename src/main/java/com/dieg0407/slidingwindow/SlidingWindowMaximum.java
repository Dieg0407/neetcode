package com.dieg0407.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        final Deque<Integer> deque = new LinkedList<>();
        final int[] result = new int[nums.length - k + 1];

        int i = 0;
        for (; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        result[i - k] = nums[deque.peekFirst()];

        for (; i < nums.length; i++) {
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }
}
