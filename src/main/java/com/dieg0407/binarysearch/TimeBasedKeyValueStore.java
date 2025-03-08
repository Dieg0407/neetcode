package com.dieg0407.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {
    private final Map<String, List<TimeValue>> map;

    public TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        final var times = map.getOrDefault(key, new ArrayList<>());
        times.add(new TimeValue(value, timestamp));

        map.put(key, times);
    }

    public String get(String key, int timestamp) {
        if (map.get(key) == null) {
            return "";
        }

        final List<TimeValue> times = map.get(key);
        int left = 0, right = times.size() - 1;

        while (left < right) {
            if (right - left == 1) {
                var leftTime = times.get(left);
                var rightTime = times.get(right);

                if (leftTime.timestamp <= timestamp && rightTime.timestamp > timestamp) {
                    return leftTime.value;
                } else if (rightTime.timestamp <= timestamp) {
                    return rightTime.value;
                } else {
                    return "";
                }
            }

            int mid = (left + right) / 2;
            var midTime = times.get(mid);

            if (midTime.timestamp == timestamp) {
                return midTime.value;
            } else if (midTime.timestamp < timestamp) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (times.get(left).timestamp <= timestamp) {
            return times.get(left).value;
        }

        return "";
    }

    private record TimeValue(String value, int timestamp) {

    }
}
