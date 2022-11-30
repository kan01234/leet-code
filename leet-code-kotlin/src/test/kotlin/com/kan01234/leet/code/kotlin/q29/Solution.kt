package com.kan01234.leet.code.kotlin.q29

/**
 * https://leetcode.com/problems/divide-two-integers/
 */
class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        // overflow case
        if (dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE
        val sign = if (dividend >= 0 && divisor >= 0 || dividend < 0 && divisor < 0) 1 else -1
        var ldividend = Math.abs(dividend.toLong())
        val ldivisor = Math.abs(divisor.toLong())
        var result = 0
        var shift = 31
        while (ldividend >= ldivisor) {
            while (ldivisor shl shift > ldividend) {
                shift--
            }
            ldividend -= ldivisor shl shift
            result += 1 shl shift
        }
        return if (sign == 1) result else -result
    }
}