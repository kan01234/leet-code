package com.kan01234.leet.code.java.q1615;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        // Example 1
        int[][] roads1 = {{0, 1}, {0, 3}, {1, 2}, {1, 3}};
        int n1 = 4;
        int expected1 = 4;
        int result1 = solution.maximalNetworkRank(n1, roads1);
        assertEquals(expected1, result1);

        // Example 2
        int[][] roads2 = {{0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2, 4}};
        int n2 = 5;
        int expected2 = 5;
        int result2 = solution.maximalNetworkRank(n2, roads2);
        assertEquals(expected2, result2);

        // Example 3
        int[][] roads3 = {{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}};
        int n3 = 8;
        int expected3 = 5;
        int result3 = solution.maximalNetworkRank(n3, roads3);
        assertEquals(expected3, result3);

        // Edge case: n = 1 (only one city)
        int[][] roads4 = {};
        int n4 = 1;
        int expected4 = 0;
        int result4 = solution.maximalNetworkRank(n4, roads4);
        assertEquals(expected4, result4);

        // Edge case: n = 2 (two cities, no roads)
        int[][] roads5 = {};
        int n5 = 2;
        int expected5 = 0;
        int result5 = solution.maximalNetworkRank(n5, roads5);
        assertEquals(expected5, result5);

        // Edge case: n = 2 (two cities, one road)
        int[][] roads6 = {{0, 1}};
        int n6 = 2;
        int expected6 = 1;
        int result6 = solution.maximalNetworkRank(n6, roads6);
        assertEquals(expected6, result6);

        // Edge case: n = 3 (three cities, fully connected)
        int[][] roads7 = {{0, 1}, {0, 2}, {1, 2}};
        int n7 = 3;
        int expected7 = 3;
        int result7 = solution.maximalNetworkRank(n7, roads7);
        assertEquals(expected7, result7);

    }
}
