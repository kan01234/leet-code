package com.kan01234.leet.code.kotlin.q126

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestCase {
    private val solution = Solution()
    @Test
    @Throws(Exception::class)
    fun test() {
        Assertions.assertIterableEquals(
            listOf(
                listOf("hit", "hot", "lot", "log", "cog"),
                listOf("hit", "hot", "dot", "dog", "cog")
            ),
            solution.findLadders("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog"))
        )
        Assertions.assertIterableEquals(
            listOf(
                listOf("a", "c")
            ),
            solution.findLadders("a", "c", listOf("a", "b", "c"))
        )
    }
}