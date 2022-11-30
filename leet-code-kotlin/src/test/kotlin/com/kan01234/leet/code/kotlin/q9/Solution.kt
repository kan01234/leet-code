package com.kan01234.leet.code.kotlin.q9

/**
 * https://leetcode.com/problems/palindrome-number/
 */
class Solution {
    fun isPalindrome(x: Int): Boolean {
        var x = x
        if (x < 0 || x != 0 && x % 10 == 0) return false
        var revertedNumber = 0
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10
            x /= 10
        }
        return x == revertedNumber || x == revertedNumber / 10
    }
}