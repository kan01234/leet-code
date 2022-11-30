package com.kan01234.leet.code.java.q29;

/**
 * https://leetcode.com/problems/divide-two-integers/
 */

public class Solution {
    public int divide(int dividend, int divisor) {
        // overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = (dividend >= 0 && divisor >= 0) || (dividend < 0 && divisor < 0) ? 1 : -1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0, shift = 31;
        while (ldividend >= ldivisor) {
            while (ldivisor << shift > ldividend) {
                shift--;
            }
            ldividend -= ldivisor << shift;
            result += 1 << shift;
        }
        return sign == 1 ? result : -result;
    }
}
