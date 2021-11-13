package com.anil.ds.array;

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

        return false;
    }
}
