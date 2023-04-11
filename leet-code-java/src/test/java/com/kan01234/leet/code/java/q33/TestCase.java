package com.kan01234.leet.code.java.q33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(solution.search(new int[] { 4,5,6,7,0,1,2 }, 0), 4);
        assertEquals(solution.search(new int[] { 4,5,6,7,0,1,2 }, 3), -1);
        assertEquals(solution.search(new int[] { 1 }, 0), -1);
    }
}
