package com.kan01234.leet.code.kotlin.q1304

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TestCase {
    private val solution = Solution()
    @Test
    fun test() {
        assertArrayEquals(solution.sumZero(5), intArrayOf(-4, -2, 0, 2, 4))
        assertArrayEquals(solution.sumZero(1), intArrayOf(0))
        assertArrayEquals(solution.sumZero(3), intArrayOf(-2, 0, 2))

    }
}