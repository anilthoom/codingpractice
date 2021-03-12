package com.anilt.leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sR = new SquareRoot();

    }
    public int mySqrt(int x) {
        double resultD = Math.sqrt(Double.parseDouble(""+x));
        return Integer.parseInt(""+resultD);         
    }
}
