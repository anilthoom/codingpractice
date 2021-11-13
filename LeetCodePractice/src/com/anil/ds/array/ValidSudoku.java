package com.anil.ds.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] board = {
                         {'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(validSudoku.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        List<Character> rowList = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        return false;
    }
}
