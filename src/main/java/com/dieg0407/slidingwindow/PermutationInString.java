package com.dieg0407.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        final var counts = new HashMap<Character, Integer>();
        final var uniques = new HashSet<>();

        for (char c : s1.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
            uniques.add(c);
        }

        int left = 0, right = 0;

        while (right < s2.length()) {
            if (counts.isEmpty()) {
                return true;
            }

            char pivot = s2.charAt(right);
            if (!uniques.contains(pivot)) {
                while (left < right) {
                    char leftChar = s2.charAt(left);
                    counts.put(leftChar, counts.getOrDefault(leftChar, 0) + 1);
                    left++;
                }
                right++;
                left = right;
                continue;
            }

            int count = counts.getOrDefault(pivot, 0);
            if (count == 1) {
                counts.remove(pivot);
            } else if (count > 1) {
                counts.put(pivot, count - 1);
            } else {
                while (left < right) {
                    char leftChar = s2.charAt(left);
                    if (leftChar == pivot) {
                        left++;
                        break;
                    }

                    counts.put(leftChar, counts.getOrDefault(leftChar, 0) + 1);
                    left++;
                }
            }
            right++;
        }

        return counts.isEmpty();
    }
}
