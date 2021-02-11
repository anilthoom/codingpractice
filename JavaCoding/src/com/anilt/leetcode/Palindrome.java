package com.anilt.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        StringBuffer sb = new StringBuffer(x);
        sb.reverse();
        System.out.println(sb.toString());
       /* int reversedInt = Integer.parseInt(reverStr);
        if (x == reversedInt)
            return true;*/
        return false;
    }
}
