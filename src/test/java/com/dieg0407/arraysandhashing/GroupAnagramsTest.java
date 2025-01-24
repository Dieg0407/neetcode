package com.dieg0407.arraysandhashing;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    void example1() {
        var strs = new String[] { "act", "pots", "tops", "cat", "stop", "hat" };
        assertThat(solution.groupAnagrams(strs))
                .containsExactlyInAnyOrder(
                        Arrays.asList("hat"),
                        Arrays.asList("act", "cat"),
                        Arrays.asList("pots", "tops", "stop"));
    }

    @Test
    void example2() {
        var strs = new String[] { "x" };
        assertThat(solution.groupAnagrams(strs))
                .containsExactlyInAnyOrder(Arrays.asList("x"));
    }

    @Test
    void example3() {
        var strs = new String[] { "" };
        assertThat(solution.groupAnagrams(strs))
                .containsExactlyInAnyOrder(Arrays.asList(""));

    }
}
