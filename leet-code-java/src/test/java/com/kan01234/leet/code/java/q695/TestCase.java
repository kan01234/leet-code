package com.kan01234.leet.code.java.q695;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        int[][] grid1 = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        assertEquals(4, solution.maxAreaOfIsland(grid1));

        int[][] grid2 = {
                {1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        assertEquals(4, solution.maxAreaOfIsland(grid2));

        int[][] grid3 = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        assertEquals(0, solution.maxAreaOfIsland(grid3));

        int[][] grid4 = {
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        };
        assertEquals(7, solution.maxAreaOfIsland(grid4));

        int[][] grid5 = {
                {1, 0, 1, 1, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1}
        };
        assertEquals(6, solution.maxAreaOfIsland(grid5));
    }
}
