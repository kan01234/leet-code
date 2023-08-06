package com.kan01234.leet.code.java.q2193;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(
                2,
                solution.minMovesToMakePalindrome("aabb")
        );

        assertEquals(
                2,
                solution.minMovesToMakePalindrome("letelt")
        );
    }
}
