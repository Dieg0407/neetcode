package com.dieg0407.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }

        final Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        stack.push(heights[0]);
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] >= stack.peek()) {
                stack.push(heights[i]);
                continue;
            }

            int counter = 0;
            while (!stack.isEmpty() && stack.peek() > heights[i]) {
                counter++;
                maxArea = Math.max(maxArea, stack.pop() * counter);
            }
            for (int j = 0; j < counter + 1; j++) {
                stack.push(heights[i]);
            }
        }

        int counter = 0;
        while (!stack.isEmpty()) {
            counter++;
            maxArea = Math.max(maxArea, stack.pop() * counter);
        }

        return maxArea;
    }
}
