package com.kan01234.leet.code.kotlin.q344

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestCase {
    var reverseString = Solution()
    @Test
    @Throws(Exception::class)
    fun test() {
        val s = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString.reverseString(s)
        Assertions.assertEquals(String(s), "olleh")
    }
}