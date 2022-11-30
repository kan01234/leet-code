package com.kan01234.leet.code.kotlin.q412

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class TestCase {
    private var fizzBuzz = Solution()
    @Test
    @Throws(Exception::class)
    fun test() {
        Assertions.assertEquals(fizzBuzz.fizzBuzz(3), Arrays.asList("1", "2", "Fizz"))
        Assertions.assertEquals(fizzBuzz.fizzBuzz(5), Arrays.asList("1", "2", "Fizz", "4", "Buzz"))
        Assertions.assertEquals(fizzBuzz.fizzBuzz(15), Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"))
    }
}