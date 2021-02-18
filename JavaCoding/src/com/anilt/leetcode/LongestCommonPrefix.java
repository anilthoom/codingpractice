//https://leetcode.com/problems/longest-common-prefix/
package com.anilt.leetcode;

import java.util.Stack;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strings));
    }
    public String longestCommonPrefix(String[] strs) {
        String baseStr = strs[0];
        char[] baseChars = baseStr.toCharArray();
        boolean[] asciiArr = new boolean[256];
        for(char c : baseChars){
            asciiArr[c] = true;
        }
        Stack<Character> charsStack = new Stack<Character>();
        for(int i=1; i<strs.length; i++){

        }
        return "";
    }
}
