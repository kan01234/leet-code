package com.kan01234.leet.code.kotlin.q127

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestCase {
    private val solution = Solution()
    @Test
    @Throws(Exception::class)
    fun test() {
        Assertions.assertEquals(
            5,
            solution.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog"))
        )
        Assertions.assertEquals(
            0,
            solution.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log"))
        )
    }
}