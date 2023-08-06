package com.kan01234.leet.code.java.q2193;

/**
 * The MinMovesToMakePalindrome class contains a method to calculate the minimum number of moves
 * required to make a given string a palindrome.
 * <p>
 * The algorithm iterates through the string and tries to find matching characters from both ends.
 * If a matching character is found, it simulates swapping characters to make the string closer
 * to being a palindrome. If no matching character is found, it calculates the distance of the
 * character from the middle and adds it to the answer. The process continues until the entire
 * string is traversed and the minimum number of moves is computed.
 * <p>
 * Time Complexity: O(N^2)
 * The algorithm uses nested loops to check for matching characters, resulting in a quadratic time
 * complexity. The outer loop runs N times, and the inner loop can run N - 1 times at most, making
 * the total number of iterations N * (N - 1), which simplifies to O(N^2).
 * <p>
 * Space Complexity: O(N)
 * The algorithm uses a character array to store the characters of the input string. Therefore,
 * the space complexity is O(N).
 */
public class Solution {
    public int minMovesToMakePalindrome(String s) {
        int n = s.length();
        if (n <= 2) {
            return 0;
        }

        int ans = 0;
        char[] cs = s.toCharArray();

        for (int i = 0, j = n - 1; i < j; ++i) {
            boolean even = false;
            for (int k = j; k != i; --k) {
                if (cs[i] == cs[k]) {
                    even = true;
                    for (; k < j; ++k) {
                        char t = cs[k];
                        cs[k] = cs[k + 1];
                        cs[k + 1] = t;
                        ++ans;
                    }
                    --j;
                    break;
                }
            }
            if (!even) {
                ans += n / 2 - i;
            }
        }
        return ans;

    }
}
