package com.kan01234.leet.code.java.q39;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertIterableEquals(
                solution.combinationSum(new int [] { 2, 3, 6, 7}, 7),
                Arrays.asList(
                        Arrays.asList(2, 2, 3),
                        Arrays.asList(7)
                )
        );

        assertIterableEquals(
                solution.combinationSum(new int [] { 2, 3, 5}, 8),
                Arrays.asList(
                        Arrays.asList(2, 2, 2, 2),
                        Arrays.asList(2, 3, 3),
                        Arrays.asList(3, 5)
                )
        );
    }
}
