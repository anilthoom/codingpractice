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
        String prefix = "";
        for(char c : baseChars){
            prefix += c;
            for(int i=1; i<strs.length; i++){
                if(strs[i].startsWith(prefix)){

                }
            }
        }
        return prefix;
    }
}