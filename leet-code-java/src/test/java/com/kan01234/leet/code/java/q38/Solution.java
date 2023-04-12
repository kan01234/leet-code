package com.kan01234.leet.code.java.q38;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";

        String pre = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        char cur = pre.charAt(0);
        int count = 1;

        for (int i = 1; i < pre.length(); i++) {
            if (pre.charAt(i) == cur) {
                count++;
            } else {
                result.append(count);
                result.append(cur);
                cur = pre.charAt(i);
                count = 1;
            }
        }

        result.append(count);
        result.append(cur);

        return result.toString();
    }
}
