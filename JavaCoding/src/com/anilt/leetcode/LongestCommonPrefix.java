//https://leetcode.com/problems/longest-common-prefix/
package com.anilt.leetcode;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strings));
    }
    public String longestCommonPrefix(String[] strs) {
        String baseStr = strs[0];
        char[] baseChars = baseStr.toCharArray();
        for(char c : baseChars){
        }
        String prefix = "";
        for(int i=1; i<strs.length; i++){
            System.out.println(strs[i]);
        }
        return prefix;
    }
}