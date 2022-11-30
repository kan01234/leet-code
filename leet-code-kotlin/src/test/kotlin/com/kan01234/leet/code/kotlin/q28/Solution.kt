package com.kan01234.leet.code.kotlin.q28

/*
 * 28. [Implement strStr()](https://leetcode.com/problems/implement-strstr/)
 */
internal class Solution {
    fun strStr(haystack: String, needle: String?): Int {
        val hLen = haystack.length
        val nLen = needle!!.length
        for (i in 0 until hLen) {
            if (i + nLen > hLen) return -1
            if (haystack.substring(i, i + nLen) == needle) return i
        }
        return -1
    }
}