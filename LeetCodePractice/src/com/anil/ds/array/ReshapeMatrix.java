package com.anil.ds.array;

public class ReshapeMatrix {
    public static void main(String[] args) {
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        int mat[][] = {{1,2},{3,4}};
        int r =1; int c=4;
        reshapeMatrix.matrixReshape(mat, r, c);
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m=mat[0].length, k=0;
        if(r*c != n*m)
            return mat;
        int[][] ans = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++, k++){
                ans[i][j] = mat[k/m][k%m];
            }
        }
        return ans;
    }
}
