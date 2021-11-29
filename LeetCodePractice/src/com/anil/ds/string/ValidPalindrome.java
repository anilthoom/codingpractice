package com.anil.ds.string;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("0P"));
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        if(s.isEmpty())
            return true;
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        if(s.equals(stringBuilder.toString()))
            return true;
        return false;
    }
}
