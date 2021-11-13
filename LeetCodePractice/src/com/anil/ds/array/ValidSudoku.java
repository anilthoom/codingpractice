package com.anil.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
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
        Map<Integer, List<Character>> matrix3X3Map = new HashMap<>();
        Map<Integer, List<Character>> colMap = new HashMap<>();
        for(int i=0; i<board.length; i++){

            List<Character> rowList = new ArrayList<>();
            for (int j=0; j<board[i].length; j++){
                char elem = board[i][j];
                // Row Check
                if(rowList.contains(elem))
                    return false;
                else if(elem != '.'){
                    rowList.add(elem);

                    //Column chek
                    List<Character> charColList = new ArrayList<>();
                    if(colMap.get(j) != null){
                        charColList = colMap.get(j);
                        if(charColList.contains(elem))
                            return false;
                    }
                    charColList.add(elem);
                    colMap.put(j, charColList);

                    //3X3 Matrix check
                    List<Character> charMatrixList = new ArrayList<>();
                    int matrixNo = findMatrixIndex(i, j);
                    if(matrix3X3Map.get(matrixNo) != null){
                        charMatrixList = matrix3X3Map.get(matrixNo);
                        if(charMatrixList.contains(elem))
                            return false;
                    }
                    charMatrixList.add(elem);
                    matrix3X3Map.put(matrixNo, charMatrixList);
                }
            }
        }
        return true;
    }
    private int findMatrixIndex(int i, int j){
        if( (i==0 || i==1 || i==2) ){ //Matrix Row-1
            if((j==0 || j==1 ||j==2)){
                return 1;
            }
            else if((j==3 || j==4 ||j==5)){
                return 2;
            }
            else if((j==6 || j==7 ||j==8)){
                return 3;
            }
        }
        else if( (i==3 || i==4 || i==5) ){//Matrix Row-2
            if((j==0 || j==1 ||j==2)){
                return 4;
            }
            else if((j==3 || j==4 ||j==5)){
                return 5;
            }
            else if((j==6 || j==7 ||j==8)){
                return 6;
            }
        }
        else if( (i==6 || i==7 || i==8) ){//Matrix Row-2
            if((j==0 || j==1 ||j==2)){
                return 7;
            }
            else if((j==3 || j==4 ||j==5)){
                return 8;
            }
            else if((j==6 || j==7 ||j==8)){
                return 9;
            }
        }
        return -1;
    }
}
