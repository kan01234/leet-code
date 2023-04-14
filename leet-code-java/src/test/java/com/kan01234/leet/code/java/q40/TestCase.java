package com.kan01234.leet.code.java.q40;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertIterableEquals(
                solution.combinationSum2(new int [] { 10, 1, 2, 7, 6, 1, 5 }, 8),
                Arrays.asList(
                        Arrays.asList(1, 1, 6),
                        Arrays.asList(1, 2, 5),
                        Arrays.asList(1, 7),
                        Arrays.asList(2, 6)
                )
        );

        assertIterableEquals(
                solution.combinationSum2(new int [] { 2, 5, 2, 1, 2 }, 5),
                Arrays.asList(
                        Arrays.asList(1, 2, 2),
                        Arrays.asList(5)
                )
        );
    }
}
