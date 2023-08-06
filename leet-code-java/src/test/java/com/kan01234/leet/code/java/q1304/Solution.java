package com.kan01234.leet.code.java.q1304;

public class Solution {
    /**
     * Returns an array containing n unique integers such that they add up to 0.
     *
     * The algorithm generates the array by placing positive and negative integers in pairs, starting from 1 and -1.
     * If n is even, it generates n/2 positive and n/2 negative integers. If n is odd, it generates (n-1)/2 positive and (n-1)/2 negative integers, and adds a 0 at the end.
     *
     * @param n The number of unique integers to generate in the array.
     * @return The array containing n unique integers that add up to 0.
     *
     * @implNote The time complexity of this algorithm is O(n), where n is the number of unique integers to generate.
     * The algorithm iterates through n/2 elements and places positive and negative integers in pairs.
     *
     * @implNote The space complexity of this algorithm is O(n), as the algorithm creates an array of size n to store the unique integers.
     *
     */
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 1, j = 0; i <= n / 2; ++i) {
            ans[j++] = i; // Place positive integer in the array
            ans[j++] = -i; // Place corresponding negative integer in the array
        }
        // If n is odd, add a 0 at the end of the array
        if (n % 2 != 0) {
            ans[n - 1] = 0;
        }
        return ans;
    }
}
