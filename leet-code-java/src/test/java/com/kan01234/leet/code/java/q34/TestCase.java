package com.kan01234.leet.code.java.q34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    Solution palindromeNumber = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(palindromeNumber.isPalindrome(-121), false);
        assertEquals(palindromeNumber.isPalindrome(121), true);
        assertEquals(palindromeNumber.isPalindrome(10), false);
    }
}
