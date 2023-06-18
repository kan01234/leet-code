package com.kan01234.leet.code.java.q594;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        // Test case 1: Example case
        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        assertEquals(5, solution.findLHS(nums1));

        // Test case 3: Array with single harmonious subsequence
        int[] nums3 = {1, 2, 3, 4, 4, 5};
        assertEquals(3, solution.findLHS(nums3));

        // Test case 4: Array with multiple harmonious subsequences
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, solution.findLHS(nums4));

        // Test case 5: Array with negative numbers
        int[] nums5 = {-2, -1, 0, 1, 0, -1, -2, -3};
        assertEquals(4, solution.findLHS(nums5));
    }
}
