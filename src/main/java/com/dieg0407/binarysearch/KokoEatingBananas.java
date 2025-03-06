package com.dieg0407.binarysearch;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        if (h == piles.length) {
            return max;
        }

        int left = 1, right = max;

        while (left < right - 1) {
            int mid = (left + right) / 2;
            int hours = calculateHours(piles, mid);

            if (hours > h) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (calculateHours(piles, left) < h) {
            return left;
        }

        return right;
    }

    private int calculateHours(int[] piles, int pivot) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / pivot;
            if (piles[i] % pivot != 0) {
                hours++;
            }

        }
        return hours;
    }
}
