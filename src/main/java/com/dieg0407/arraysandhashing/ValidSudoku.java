package com.dieg0407.arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * ref: https://neetcode.io/problems/valid-sudoku
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        var columnValues = initialize(board[0].length);
        var rowValues = initialize(board.length);
        var tableValues = initialize(board.length);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                var character = board[i][j];
                if (character == '.') {
                    continue;
                }
                if (columnValues.get(j).contains(character)) {
                    return false;
                }
                if (rowValues.get(i).contains(character)) {
                    return false;
                }
                int table = 3 * (i / 3) + (j / 3);
                if (tableValues.get(table).contains(character)) {
                    return false;
                }

                columnValues.get(j).add(character);
                rowValues.get(i).add(character);
                tableValues.get(table).add(character);
            }
        }

        return true;
    }

    private HashMap<Integer, HashSet<Character>> initialize(int number) {
        var map = new HashMap<Integer, HashSet<Character>>();
        for (int i = 0; i < number; i++) {
            map.put(i, new HashSet<>());
        }
        return map;
    }
}
