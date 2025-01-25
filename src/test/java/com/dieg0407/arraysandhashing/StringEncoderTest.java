package com.dieg0407.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

class StringEncoderTest {
    private final StringEncoder solution = new StringEncoder();

    @Test
    void example1() {
        var parts = Arrays.asList("neet", "code", "love", "you");

        var encoded = solution.encode(parts);
        var decoded = solution.decode(encoded);

        assertThat(decoded)
                .containsExactly("neet", "code", "love", "you");
    }

    @Test
    void example2() {
        var parts = Arrays.asList("we", "say", ":", "yes");

        var encoded = solution.encode(parts);
        var decoded = solution.decode(encoded);

        assertThat(decoded)
                .containsExactly("we", "say", ":", "yes");
    }
}
