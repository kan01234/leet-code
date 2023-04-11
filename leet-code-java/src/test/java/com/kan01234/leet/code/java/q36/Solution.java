package com.kan01234.leet.code.java.q36;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];

                // skip empty
                if (value < '1' || value > '9') {
                    continue;
                }

                if (rows[row].contains(value)) {
                    return false;
                }
                rows[row].add(value);

                if (columns[col].contains(value)) {
                    return false;
                }
                columns[col].add(value);

                int box = (row / 3) * 3 + col / 3;
                if (boxes[box].contains(value)) {
                    return false;
                }
                boxes[box].add(value);
            }
        }

        return true;
    }
}
