package com.kan01234.leet.code.java.q47;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertAll(
                () -> assertTrue(solution.permuteUnique(new int[] { 1, 1, 2 }).containsAll(List.of(
                        List.of(1, 1, 2),
                        List.of(1, 2, 1),
                        List.of(2, 1, 1)
                )), "Iterable does not contain all expected elements")
        );
        assertAll(
                () -> assertTrue(solution.permuteUnique(new int[] { 1, 2, 3 }).containsAll(List.of(
                        //[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
                        List.of(1, 2, 3),
                        List.of(1, 3, 2),
                        List.of(2, 1, 3),
                        List.of(2, 3, 1),
                        List.of(3, 1, 2),
                        List.of(3, 2, 1)
                )), "Iterable does not contain all expected elements")
        );
    }
}
