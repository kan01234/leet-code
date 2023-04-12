package com.kan01234.leet.code.java.q38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(solution.countAndSay(1), "1");
        assertEquals(solution.countAndSay(4), "1211");
    }
}
