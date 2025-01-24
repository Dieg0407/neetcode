package com.dieg0407;

import java.util.HashMap;

/**
 * ref: https://neetcode.io/problems/is-anagram
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }

        var hashTable = new HashMap<Integer, Integer>();
        s.chars().forEach(character -> {
            var count = hashTable.getOrDefault(character, 0);
            hashTable.put(character, count + 1);
        });

        t.chars().forEach(character -> {
            var count = hashTable.getOrDefault(character, 0);
            if (count == 1) {
                hashTable.remove(character);
                return;
            }
            if (count > 1) {
                hashTable.put(character, count - 1);
                return;
            }
        });

        return hashTable.size() == 0;
    }
}
