package com.kan01234.leet.code.kotlin.q22

/**
 * https://leetcode.com/problems/generate-parentheses/
 */

class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val results: MutableList<String> = arrayListOf()
        backTracking(0, 0, n, StringBuilder(), results)
        return results
    }

    fun backTracking(open: Int, close: Int, count: Int, sb: StringBuilder, results: MutableList<String>) {
//        println("sb: $sb, open: $open,close: $close")
        if (sb.length == count * 2) {
            results.add(sb.toString())
            return
        }
        if (open < count) {
            backTracking(open + 1, close, count, sb.append("("), results)
            sb.deleteCharAt(sb.length - 1)
        }
        if (close < open) {
            backTracking(open, close + 1, count, sb.append(")"), results)
            sb.deleteCharAt(sb.length - 1)
        }
    }
}