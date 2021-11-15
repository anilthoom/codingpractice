package com.anil.ds.array;

//https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DMatrix {
    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 65;
        System.out.println(search2DMatrix.searchMatrix(matrix, target));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0; i<matrix.length;i++){
            int rowLength = matrix[i].length;
            for(int j=0; j<rowLength; j++){
                if(target >= matrix[i][0] && target <= matrix[i][rowLength-1]){
                    //Traverse to find the element
                    if(target == matrix[i][j]){
                        return true;
                    }
                }
                else {
                    break;
                }
            }
        }
        return false;
    }
}
