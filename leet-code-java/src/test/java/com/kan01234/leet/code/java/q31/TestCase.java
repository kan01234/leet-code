package com.kan01234.leet.code.java.q31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[] nums = new int[] { 1,2,3 };
        solution.nextPermutation(nums);
        assertArrayEquals(nums, new int[] { 1,3,2 });

        nums = new int[] { 3,2,1 };
        solution.nextPermutation(nums);
        assertArrayEquals(nums, new int[] { 1,2,3 });

        nums = new int[] { 1,1,5 };
        solution.nextPermutation(nums);
        assertArrayEquals(nums, new int[] { 1,5,1 });
    }
}
