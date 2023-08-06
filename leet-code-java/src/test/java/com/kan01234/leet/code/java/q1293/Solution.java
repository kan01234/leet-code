package com.kan01234.leet.code.java.q1293;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Find the maximum possible length of a concatenated string formed by a subsequence of {@code arr} that has unique characters.
     *
     * The algorithm uses bit manipulation and a list to efficiently find the maximum length of a concatenated string with unique characters.
     *
     * @param arr The list of strings from which subsequences are formed.
     * @return The maximum possible length of a concatenated string with unique characters.
     *
     * @implNote The time complexity of this algorithm is O(N^2 * 2^M), where N is the number of strings in the input list {@code arr}, and M is the maximum length of a string in the list.
     * The time complexity is dominated by the combination checks of bitmasks, which can take O(N * 2^M) time for each string.
     *
     * @implNote The memory complexity of this algorithm is O(2^M * M + N * M), where M is the number of distinct characters in the input list {@code arr}.
     * The algorithm stores the bitmasks for each character in the list, which can have up to 2^M unique bitmasks, each of length M.
     * Additionally, each string's bitmask takes O(M) memory.
     *
     * @see <a href="https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/">LeetCode Problem 1239</a>
     */
    public int maxLength(List<String> arr) {
        int ans = 0;
        List<Integer> masks = new ArrayList<>();
        masks.add(0); // Bitmask for an empty string with no characters

        // Process each string in the input list `arr`
        for (String s : arr) {
            int mask = 0;
            boolean hasDuplicate = false;

            // Build the bitmask for the current string `s`
            for (char c : s.toCharArray()) {
                int j = c - 'a';

                // Check for duplicates using bit manipulation
                if ((mask & (1 << j)) != 0) {
                    hasDuplicate = true;
                    break;
                }
                mask |= 1 << j;
            }

            if (hasDuplicate) {
                continue;
            }

            int n = masks.size();
            // Combine the current bitmask with existing bitmasks in the `masks` list
            for (int i = 0; i < n; ++i) {
                int m = masks.get(i);
                // Check if the combined bitmask has no common bits with any existing bitmask
                if ((m & mask) == 0) {
                    masks.add(m | mask);
                    ans = Math.max(ans, Integer.bitCount(m | mask));
                }
            }
        }
        return ans;
    }
}
