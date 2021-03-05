package com.anilt.leetcode;

public class StringFind {
    public static void main(String[] args) {
        StringFind sf = new StringFind();
        System.out.println(sf.strStr("Hello", "ll"));
    }
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 || needle.length()==0)
            return 0;
        
        return -1;
    }
}
