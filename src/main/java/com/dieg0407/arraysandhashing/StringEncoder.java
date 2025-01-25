package com.dieg0407.arraysandhashing;

import java.util.ArrayList;
import java.util.List;

/**
 * ref: https://neetcode.io/problems/string-encode-and-decode
 */
public class StringEncoder {
    public String encode(List<String> strs) {
        var builder = new StringBuilder();
        strs.forEach(str -> {
            var prefix = "%d#".formatted(str.length());
            builder.append(prefix);
            builder.append(str);
        });

        return builder.toString();
    }

    public List<String> decode(String str) {
        var parts = new ArrayList<String>();
        var numberBuff = new StringBuilder();

        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                numberBuff.append(str.charAt(i));
                continue;
            }
            var length = Integer.parseInt(numberBuff.toString());
            parts.add(str.substring(i + 1, i + length + 1));

            i += length;
            numberBuff = new StringBuilder();
        }

        return parts;
    }
}
