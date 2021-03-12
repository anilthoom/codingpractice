package com.anilt.leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sR = new SquareRoot();
        System.out.println(sR.mySqrt(4));
    }
    public int mySqrt(int x) {
        double resultD = Math.sqrt(x);
        return Integer.parseInt(""+resultD);
    }
}
