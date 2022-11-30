package com.kan01234.leet.code.kotlin.q28

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestCase {
    @Test
    fun test() {
        val solution = Solution()
        Assertions.assertEquals(solution.strStr("hello", "ll"), 2)
        Assertions.assertEquals(solution.strStr("aaaaa", "bba"), -1)
    }
}