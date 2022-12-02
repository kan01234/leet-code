package com.kan01234.leet.code.kotlin.q405

class Solution {
    fun toHex(num: Int): String {
        if (num in 0..9)
            return num.toString()
        var result = ""
        var quotient: Long = if (num >= 0) {
            num.toLong()
        } else {
            4294967296 + num
        }
        val reminderMap = mapOf<Int, String>(
            10 to "a",
            11 to "b",
            12 to "c",
            13 to "d",
            14 to "e",
            15 to "f"
        )
        while (quotient != 0L) {
            val reminder = (quotient % 16).toInt()
            quotient /= 16
            result += reminderMap.getOrDefault(reminder, reminder.toString())
        }
        return result.reversed()
    }
}