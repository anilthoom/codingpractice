package com.anil.algo.bfsdfs;

public class FloodFill {
    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        floodFill.floodFill(image, 1, 1, 2);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r-1, c, color, newColor);
            if (c >= 1) dfs(image, r, c-1, color, newColor);
            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
        }
    }
}
