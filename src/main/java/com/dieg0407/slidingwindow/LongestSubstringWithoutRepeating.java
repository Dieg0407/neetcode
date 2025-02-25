package com.dieg0407.slidingwindow;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        // we could use a LinkedHashSet but it's not supported by LeetCode
        final Queue<Character> queue = new ArrayDeque<>();
        final Set<Character> set = new HashSet<>();

        int longest = 0;

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                queue.add(c);
                continue;
            }
            longest = Math.max(longest, set.size());
            while (!set.isEmpty() && set.contains(c)) {
                char removed = queue.remove();
                set.remove(removed);
            }
            set.add(c);
            queue.add(c);
        }

        longest = Math.max(longest, set.size());

        return longest;
    }
}
