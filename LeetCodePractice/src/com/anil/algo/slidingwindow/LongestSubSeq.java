package com.anil.algo.slidingwindow;

public class LongestSubSeq {
    public static void main(String[] args) {
        LongestSubSeq longestSubSeq = new LongestSubSeq();
        System.out.println(longestSubSeq.lengthOfLongestSubstring("abcabca"));
    }
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int p1=0, p2=1;
        while (p1 < p2){
            char c = s.charAt(p1);
            String remainingSubString = s.substring(p1+1, s.length());
            if(remainingSubString.contains(c+"")){
                //There is a repeating char in the remaining

            }
        }
        return maxLength;
    }
}
