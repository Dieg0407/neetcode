package com.dieg0407.slidingwindow;

import java.util.Set;
import java.util.stream.Collectors;

public class LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        final Set<Character> uniqueChars = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        int longest = 0;
        for (char character : uniqueChars) {
            int left = 0;
            int movements = k;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == character) {
                    continue;
                }
                movements--;
                if (movements >= 0) {
                    continue;
                }
                longest = Math.max(longest, i - left);
                while (s.charAt(left) == character) {
                    left++;
                }
                left++;
                movements++;
            }
            longest = Math.max(longest, s.length() - left);
        }

        return longest;
    }
}
