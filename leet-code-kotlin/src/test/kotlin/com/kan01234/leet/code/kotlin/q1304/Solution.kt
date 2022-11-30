package com.kan01234.leet.code.kotlin.q1304

/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */

class Solution {
    fun sumZero(n: Int): IntArray {
        val results = IntArray(n)
        for (i in 0 until n)
            results[i] = i * 2 - n + 1
        return results
    }
}