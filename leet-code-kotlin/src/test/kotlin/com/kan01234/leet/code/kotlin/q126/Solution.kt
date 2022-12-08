package com.kan01234.leet.code.kotlin.q126

import java.util.*
import kotlin.collections.HashSet

class Solution {
    fun findLadders(beginWord: String, endWord: String, wordList: List<String?>?): List<List<String>> {
        val results = mutableListOf<List<String>>()

        // return empty list is not contins end word
        val wordSet = HashSet(wordList)
        if (!wordSet.contains(endWord))
            return results
        var count = 0
        var isFound = false
        val visitedMap = mutableMapOf<String, Int>()
        visitedMap[beginWord] = 0
        val possibleMap = mutableMapOf<String, MutableSet<String>>()
        val queue: Queue<String> = ArrayDeque()
        queue.add(beginWord)
        do {
            count += 1
            var size = queue.size
            do {
                val word = queue.poll()
                for (i in 0 until word.length) {
                    val sb = StringBuilder(word)
                    var c = 'a'
                    while (c <= 'z') {
                        sb.setCharAt(i, c)
                        val tmp = sb.toString()
                        if (visitedMap.getOrDefault(tmp, 0) == count) {
                            possibleMap[tmp]!!.add(word)
                        }

                        // skip same word
                        if (tmp == word || !wordSet.contains(tmp)) {
                            c++
                            continue
                        }
                        possibleMap.putIfAbsent(tmp, HashSet(listOf(word)))
                        wordSet.remove(tmp)
                        queue.add(tmp)
                        visitedMap[tmp] = count
                        if (tmp == endWord) {
                            isFound = true
                        }
                        c++
                    }
                }
            } while (--size > 0)
        } while (!queue.isEmpty() && !isFound)

        // return empty list if not found end word
        if (!isFound) return results

        // start searching the possible map
        val path: Deque<String> = ArrayDeque()
        path.add(endWord)
        // backtracking from endword
        dfs(endWord, beginWord, possibleMap, path, results)
        return results
    }

    private fun dfs(
        curWord: String,
        targetWord: String,
        possibleMap: Map<String, MutableSet<String>>,
        path: Deque<String>,
        results: MutableList<List<String>>
    ) {
        if (curWord == targetWord) {
            results.add(ArrayList(path))
            return
        }
        for (possible in possibleMap.getOrDefault(curWord, mutableSetOf())) {
            path.addFirst(possible)
            dfs(possible, targetWord, possibleMap, path, results)
            path.removeFirst()
        }
    }
}