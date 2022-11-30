package com.kan01234.leet.code.kotlin.q22

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCase {
    private var generateParenthesis = Solution()
    @Test
    @Throws(Exception::class)
    fun test() {
        assertEquals(generateParenthesis.generateParenthesis(1), listOf("()"))
        assertEquals(generateParenthesis.generateParenthesis(3), listOf("((()))", "(()())", "(())()", "()(())", "()()()"))
    }
}