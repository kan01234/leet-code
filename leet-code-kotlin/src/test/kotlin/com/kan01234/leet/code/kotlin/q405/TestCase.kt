package com.kan01234.leet.code.kotlin.q405

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCase {
    private val solution = Solution()
    @Test
    fun test() {
        assertEquals("0", solution.toHex(0))
        assertEquals("ffffffff", solution.toHex(-1))
        assertEquals("1a", solution.toHex(26))
    }
}