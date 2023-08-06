package com.kan01234.leet.code.java.q453;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(
                3,
                solution.minMoves(new int[] { 1,2,3 })
        );

        assertEquals(
                0,
                solution.minMoves(new int[] { 0 })
        );
    }
}
