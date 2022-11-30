package com.kan01234.leet.code.kotlin.q412

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val results: MutableList<String> = arrayListOf()
        for (i in 1..n) {
            val str = i.toString() + ""
            if (i % 15 == 0) {
                results.add("FizzBuzz")
                continue
            }
            if (i % 5 == 0) {
                results.add("Buzz")
                continue
            }
            if (i % 3 == 0) {
                results.add("Fizz")
                continue
            }
            results.add(str)
        }
        return results
    }
}