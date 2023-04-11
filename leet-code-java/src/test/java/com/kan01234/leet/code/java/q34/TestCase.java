package com.kan01234.leet.code.java.q34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    Solution palindromeNumber = new Solution();

    @Test
    public void test() throws Exception {
        assertArrayEquals(palindromeNumber.searchRange(new int[] { 5,7,7,8,8,10 }, 8), new int[] { 3,4 });
        assertArrayEquals(palindromeNumber.searchRange(new int[] { 5,7,7,8,8,10 }, 6), new int[] { -1,-1 });
    }
}
