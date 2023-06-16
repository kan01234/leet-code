package com.kan01234.leet.code.java.q1647;

import java.util.HashSet;

/*
 * time: O(N), N is length of input
 * space: (M), M is number of unique frequencies of characters in the input string
 */

public class Solution {
    public int minDeletions(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        HashSet<Integer> frequencies = new HashSet<>();
        int deletion = 0;
        for (int frequency : count) {
            while (frequencies.contains(frequency) && frequency > 0) {
                frequency--;
                deletion++;
            }
            frequencies.add(frequency);
        }

        return deletion;
    }
}