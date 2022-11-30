package com.kan01234.leet.code.java.q344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    Solution reverseString = new Solution();

    @Test
    public void test() throws Exception {
        char[] s = new char[]{ 'h','e','l','l','o' };
        reverseString.reverseString(s);
        assertEquals(new String(s), "olleh");
    }
}
