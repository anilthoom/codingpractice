package com.anil.ds.array;

public class ReshapeMatrix {
    public static void main(String[] args) {
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        int mat[][] = {{1,2},{3,4}};
        int r =1; int c=4;
        reshapeMatrix.matrixReshape(mat, r, c);
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length == r)
            return mat;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.println(mat[i][j]);
            }
        }
        return mat;
    }
}
