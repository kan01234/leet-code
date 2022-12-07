package com.kan01234.leet.code.java.q126;

import java.util.*;

public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> results = new ArrayList();

        // return empty list is not contins end word
        Set<String> wordSet = new HashSet(wordList);
        if (!wordSet.contains(endWord))
            return results;

        int count = 0;
        boolean isFound = false;
        Map<String, Integer> visitedMap = new HashMap();
        visitedMap.put(beginWord, 0);
        Map<String, Set<String>> possibleMap = new HashMap();
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

                        if (visitedMap.getOrDefault(tmp, 0) == count) {
                            possibleMap.get(tmp).add(word);
                        }

                        // skip same word
                        if (tmp.equals(word) || !wordSet.contains(tmp))
                            continue;

                        possibleMap.computeIfAbsent(tmp, key -> new HashSet<>()).add(word);
                        wordSet.remove(tmp);
                        queue.add(tmp);
                        visitedMap.put(tmp, count);

                        if (tmp.equals(endWord)) {
                            isFound = true;
                        }
                    }
                }
            } while (--size > 0);

        } while (!queue.isEmpty() && !isFound);

        // return empty list if not found end word
        if (!isFound)
            return results;

        // start searching the possible map
        Deque<String> path = new ArrayDeque<String>();
        path.add(endWord);
        // backtracking from endword
        dfs(endWord, beginWord, possibleMap, path, results);

        return results;
    }

    private void dfs(String curWord, String targetWord, Map<String, Set<String>> possibleMap, Deque<String> path, List<List<String>> results) {
        if (curWord.equals(targetWord)) {
            results.add(new ArrayList<>(path));
            return;
        }
        for (String possible : possibleMap.getOrDefault(curWord, Set.of())) {
            path.addFirst(possible);
            dfs(possible, targetWord, possibleMap, path, results);
            path.removeFirst();
        }
    }
}
