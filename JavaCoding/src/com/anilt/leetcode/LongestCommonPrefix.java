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
        String prefix = "";
        for(int i=1; i<strs.length; i++){

        }
        return "";
    }
}
class Main{
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "floight"};

        boolean flag = true;
        String placeHolder = null;

        for(int i = 1;i<strings[0].length();i++){
            placeHolder = strings[0].substring(0,i);

            for(String s: strings){
                if(s.startsWith(placeHolder)){
                    continue;
                }else{
                    flag = false;
                }
            }

            if(!flag){
                break;
            }
        }

        System.out.println(placeHolder);
    }

}