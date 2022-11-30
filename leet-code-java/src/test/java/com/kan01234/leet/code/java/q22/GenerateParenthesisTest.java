package com.kan01234.leet.code.java.q22;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesisTest {

    GenerateParenthesis generateParenthesis = new GenerateParenthesis();

    @Test
    public void test() throws Exception {
        assertEquals(generateParenthesis.generateParenthesis(1), Arrays.asList("()"));
        assertEquals(generateParenthesis.generateParenthesis(3), Arrays.asList("((()))","(()())","(())()","()(())","()()()"));
    }
}
