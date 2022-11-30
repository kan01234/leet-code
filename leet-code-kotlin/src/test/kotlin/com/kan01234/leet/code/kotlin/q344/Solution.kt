package com.kan01234.leet.code.kotlin.q344

class Solution {
    fun reverseString(s: CharArray) {
        var left = 0
        var right = s.size - 1
        var tmp = ' '
        while (left < right) {
            tmp = s[right]
            s[right] = s[left]
            s[left] = tmp
            left++
            right--
        }
    }
}