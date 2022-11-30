package com.kan01234.leet.code.kotlin.q9

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCase {
    private var palindromeNumber = Solution()
    @Test
    @Throws(Exception::class)
    fun test() {
        assertEquals(palindromeNumber.isPalindrome(-121), false)
        assertEquals(palindromeNumber.isPalindrome(121), true)
        assertEquals(palindromeNumber.isPalindrome(10), false)
    }
}