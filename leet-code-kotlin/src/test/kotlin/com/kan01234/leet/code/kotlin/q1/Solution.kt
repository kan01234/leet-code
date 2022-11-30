package com.kan01234.leet.code.kotlin.q1

/**
 * https://leetcode.com/problems/two-sum/
 */

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val diff = target - nums[i]
            if (map.containsKey(diff))
                return intArrayOf(map[diff]!!, i)
            map[nums[i]] = i
        }
        return IntArray(0)
    }
}