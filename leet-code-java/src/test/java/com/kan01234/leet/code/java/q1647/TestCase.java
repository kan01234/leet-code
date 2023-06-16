package com.kan01234.leet.code.java.q1647;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void testExample1() {
        String s = "aab";
        int expected = 0;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        String s = "aaabbbcc";
        int expected = 2;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testExample3() {
        String s = "ceabaacb";
        int expected = 2;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyString() {
        String s = "";
        int expected = 0;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleCharacter() {
        String s = "a";
        int expected = 0;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testAllSameCharacters() {
        String s = "bbbbbbb";
        int expected = 6;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoDeletionsNeeded() {
        String s = "abcdefgh";
        int expected = 0;
        int actual = solution.minDeletions(s);
        assertEquals(expected, actual);
    }
}
