package com.dieg0407.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        var minWindow = "";

        var counts = new HashMap<Character, Integer>();
        var control = new HashSet<Character>();

        for (var c : t.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
            control.add(c);
        }

        int left = 0, right = 0;

        while (right < s.length()) {
            char pivot = s.charAt(right);
            if (!counts.containsKey(pivot)) {
                right++;
                continue;
            }
            if (t.length() == 1) {
                return t;
            }

            int count = counts.get(pivot);
            counts.put(pivot, count - 1);
            if (count - 1 == 0) {
                control.remove(pivot);
            }

            if (!control.isEmpty()) {
                right++;
                continue;
            }
            minWindow = calculateMinWindow(s, minWindow, left, right);

            while (left < right) {
                char leftChar = s.charAt(left);
                if (!counts.containsKey(leftChar)) {
                    left++;
                    continue;
                }
                int leftCount = counts.get(leftChar);

                if (leftCount == 0 && control.isEmpty()) {
                    control.add(leftChar);
                    minWindow = calculateMinWindow(s, minWindow, left, right);
                } else if (leftCount == 0 && !control.isEmpty()) {
                    break;
                }
                counts.put(leftChar, leftCount + 1);
                left++;
            }
            right++;

        }

        return minWindow;
    }

    private static String calculateMinWindow(String full, String currMin, int left, int right) {
        if (currMin.isEmpty() || right - left < currMin.length()) {
            return full.substring(left, right + 1);
        }
        return currMin;
    }
}
