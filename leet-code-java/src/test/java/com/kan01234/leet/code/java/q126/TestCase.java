package com.kan01234.leet.code.java.q126;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestCase {

    private Solution solution = new Solution();
    @Test
    public void test() throws Exception {
        assertIterableEquals(
            List.of(
                List.of("hit", "hot", "lot", "log", "cog"),
                List.of("hit", "hot", "dot", "dog", "cog")
            ),
            solution.findLadders("hit", "cog", List.of("hot","dot","dog","lot","log","cog"))
        );
        assertIterableEquals(
            List.of(
                List.of("a", "c")
            ),
            solution.findLadders("a", "c", List.of("a", "b", "c"))
        );
    }
}
