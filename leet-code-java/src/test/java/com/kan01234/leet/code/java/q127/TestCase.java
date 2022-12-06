package com.kan01234.leet.code.java.q127;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(5,
                solution.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log","cog")));
        assertEquals(0,
                solution.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log")));
    }
}
