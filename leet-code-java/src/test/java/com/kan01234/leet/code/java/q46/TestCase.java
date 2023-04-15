package com.kan01234.leet.code.java.q46;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertAll(
                () -> assertTrue(solution.permute(new int[] { 1, 2, 3 }).containsAll(List.of(
                        List.of(1, 2, 3),
                        List.of(1, 3, 2),
                        List.of(2, 1, 3),
                        List.of(2, 3, 1),
                        List.of(3, 1, 2),
                        List.of(3, 2, 1)
                )), "Iterable does not contain all expected elements")
        );
        assertAll(
                () -> assertTrue(solution.permute(new int[] { 1, 0 }).containsAll(List.of(
                        List.of(1, 0),
                        List.of(0, 1)
                )), "Iterable does not contain all expected elements")
        );
    }
}
