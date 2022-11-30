package com.kan01234.leet.code.java.q412;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            String str = i + "";
            if (i % 15 == 0) {
                results.add("FizzBuzz");
                continue;
            }

            if (i % 5 == 0) {
                results.add("Buzz");
                continue;
            }

            if (i % 3 == 0) {
                results.add("Fizz");
                continue;
            }

            results.add(str);
        }
        return results;
    }
}
