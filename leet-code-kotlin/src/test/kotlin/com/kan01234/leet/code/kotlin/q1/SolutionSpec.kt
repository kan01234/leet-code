package com.kan01234.leet.code.kotlin.q1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TestCase {
    @Test
    fun test() {
        val solution = Solution()
        assertArrayEquals(solution.twoSum(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1))
    }
}