package com.kan01234.leet.code.java.q127;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet(wordList);
        if (!wordSet.contains(endWord))
            return 0;

        int count = 0;
        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);

        do {
            count += 1;
            int size = queue.size();

            do {
                String word = queue.poll();
                for (int i = 0; i < word.length(); i++) {
                    StringBuilder sb = new StringBuilder(word);
                    for (char c = 'a'; c <= 'z'; c++) {
                        sb.setCharAt(i, c);
                        String tmp = sb.toString();
                        if (tmp.equals(word))
                            continue;
                        if (tmp.equals(endWord))
                            return count + 1;
                        if (wordSet.contains(tmp)) {
                            wordSet.remove(tmp);
                            queue.add(tmp);
                        }
                    }
                }
            } while (--size > 0);

        } while (!queue.isEmpty());

        return 0;
    }
}
