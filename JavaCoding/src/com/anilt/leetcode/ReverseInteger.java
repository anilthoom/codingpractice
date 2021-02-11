package com.anilt.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(646324351));
    }
    public static int reverse(int x) {
        boolean isNegative = false;
        String xValue = "";
        if(x < 0 ){
            isNegative = true;
            xValue = ""+x;
            xValue = xValue.substring(1, xValue.length());
        }
        else {
            xValue = ""+x;
        }
        StringBuffer reverseStr = new StringBuffer(xValue);
        reverseStr.reverse();
        if (isNegative)
            reverseStr.insert(0, '-');
        return Integer.parseInt(reverseStr.toString());
    }
}
