package com.kan01234.leet.code.java.q261;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
//        assertEquals(true, solution.validTree(5, new int[][] {
//                new int[] { 0, 1 },
//                new int[] { 0, 2 },
//                new int[] { 0, 3 },
//                new int[] { 1, 4 },
//        }));
//
//        assertEquals(false, solution.validTree(5, new int[][] {
//                new int[] { 0, 1 },
//                new int[] { 1, 2 },
//                new int[] { 2, 3 },
//                new int[] { 1, 3 },
//                new int[] { 1, 4 },
//        }));

        assertEquals(false, solution.validTree(4, new int[][] {
                new int[] { 0, 1 },
                new int[] { 2, 3 },
        }));
    }
}
