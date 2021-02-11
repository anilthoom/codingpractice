package com.anilt.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int reversedInt = Integer.reverse(x);
        if (x == reversedInt)
            return true;
        return false;
    }
}
