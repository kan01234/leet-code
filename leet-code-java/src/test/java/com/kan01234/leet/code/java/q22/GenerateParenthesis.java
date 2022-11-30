package com.kan01234.leet.code.java.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        backTracking(0, 0, n, new StringBuilder(), results);
        return results;
    }

    public void backTracking(int open, int close, int count, StringBuilder sb, List<String> results) {
//        System.out.println("sb: " + sb.toString() + ", open: " + open + ",close: " + close);
        if (sb.length() == count * 2) {
            results.add(sb.toString());
            return;
        }
        if (open < count) {
            backTracking(open + 1, close, count, sb.append("("), results);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            backTracking(open, close + 1, count, sb.append(")"), results);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
