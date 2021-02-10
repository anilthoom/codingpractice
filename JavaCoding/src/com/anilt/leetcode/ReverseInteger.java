package com.anilt.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-12345600));
    }
    public static int reverse(int x) {
        String xValue = ""+x;
        String reverseStr = "";
        for(int i=xValue.length()-1; i>=0; i--){
            reverseStr += xValue.charAt(i);
        }
        return Integer.parseInt(reverseStr);
    }
}
