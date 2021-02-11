package com.anilt.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-0123456));
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
  //      if (isNegative)
//            reverseStr = "-"+reverseStr;
        return Integer.parseInt(reverseStr.toString());
    }
}
