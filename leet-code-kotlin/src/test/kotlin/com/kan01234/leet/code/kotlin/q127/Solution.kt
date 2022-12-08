package com.kan01234.leet.code.kotlin.q127

import java.util.*

class Solution {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String?>?): Int {
        val wordSet = HashSet(wordList)
        if (!wordSet.contains(endWord)) return 0
        var count = 0
        val queue: Queue<String> = ArrayDeque()
        queue.add(beginWord)
        do {
            count += 1
            var size = queue.size
            do {
                val word = queue.poll()
                for (i in word.indices) {
                    val sb = StringBuilder(word)
                    var c = 'a'
                    while (c <= 'z') {
                        sb.setCharAt(i, c)
                        val tmp = sb.toString()
                        if (tmp == word) {
                            c++
                            continue
                        }
                        if (tmp == endWord) return count + 1
                        if (wordSet.contains(tmp)) {
                            wordSet.remove(tmp)
                            queue.add(tmp)
                        }
                        c++
                    }
                }
            } while (--size > 0)
        } while (!queue.isEmpty())
        return 0
    }
}