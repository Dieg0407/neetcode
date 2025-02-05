package com.dieg0407.twopointers;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxArea = 0;

        while (left < right) {
            int area = min(heights[left], heights[right]) * (right - left);
            maxArea = max(maxArea, area);

            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
