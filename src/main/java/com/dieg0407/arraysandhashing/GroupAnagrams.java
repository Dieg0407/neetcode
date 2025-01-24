package com.dieg0407.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ref: https://neetcode.io/problems/anagram-groups
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        var hashMap = new HashMap<String, List<String>>();
        for (var str : strs) {
            var chars = new int[26];
            for (var character : str.toCharArray()) {
                chars[character - 'a']++;
            }
            var key = Arrays.toString(chars);
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }
}
