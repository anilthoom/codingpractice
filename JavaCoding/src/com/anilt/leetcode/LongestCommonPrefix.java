//https://leetcode.com/problems/longest-common-prefix/
package com.anilt.leetcode;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strings = {"flower", "flow", "floight"};
        System.out.println(lcp.longestCommonPrefix(strings));
    }
    public String longestCommonPrefix(String[] strs) {
        String baseStr = strs[0];
        char[] baseChars = baseStr.toCharArray();
        String prefix = "";
        boolean isStartsWith = true;
        for(char c : baseChars){
            if (!isStartsWith)
                break;
            prefix += c;
            for(int i=1; i<strs.length; i++){
                if(strs[i].startsWith(prefix)){
                    isStartsWith = true;
                }
                else {
                    isStartsWith = false;
                    break;
                }
            }
        }
        if(prefix.length() > 0){
            prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }
}