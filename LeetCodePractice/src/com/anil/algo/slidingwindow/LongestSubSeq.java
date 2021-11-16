package com.anil.algo.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubSeq {
    public static void main(String[] args) {
        LongestSubSeq longestSubSeq = new LongestSubSeq();
        System.out.println(longestSubSeq.lengthOfLongestSubstring("  "));
    }
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            List<Character> charList = new ArrayList<>();
            String remainingStr = s.substring(i, s.length());
            for(int j=0; j<remainingStr.length(); j++){
                char c = remainingStr.charAt(j);
                if(charList.contains(c)){
                    break;
                }
                else {
                    charList.add(c);
                }
            }
            if(maxLength < charList.size())
                maxLength = charList.size();
            if(charList.size() == remainingStr.length())
                break;
        }
        return maxLength;
    }
}
