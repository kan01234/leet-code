package com.kan01234.leet.code.java.q45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(solution.jump(new int[] { 2, 3, 1, 1, 4 }), 2);
        assertEquals(solution.jump(new int[] { 2, 3, 0, 1, 4 }), 2);
    }
}
