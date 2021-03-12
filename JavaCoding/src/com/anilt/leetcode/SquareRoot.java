package com.anilt.leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sR = new SquareRoot();
        System.out.println(sR.mySqrt(8));
    }
    public int mySqrt(int x) {
        double resultD = Math.sqrt(x);
        int result = (int)Math.floor(resultD);
        return result;
    }
}
