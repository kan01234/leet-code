package com.kan01234.leet.code.java.q344;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tmp = ' ';
        while (left < right) {
            tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;
            left++;
            right--;
        }
    }
}
