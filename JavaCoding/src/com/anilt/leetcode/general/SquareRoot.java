package com.anilt.leetcode.general;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sR = new SquareRoot();
        System.out.println(sR.mySqrt(24));
    }
    public int mySqrt(int x) {
        double resultD = Math.sqrt(x);
        int result = (int)Math.floor(resultD);
        return result;
    }
}
