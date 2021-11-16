package com.anil.algo.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubSeq {
    public static void main(String[] args) {
        LongestSubSeq longestSubSeq = new LongestSubSeq();
        System.out.println(longestSubSeq.lengthOfLongestSubstring("abcabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
        {
            return 0;
        }
        int maxLength = 0;
        Set<Character> uniqueCharSet = new HashSet<>();
        int p1 =0 , p2=0;
        char[] charsArr = s.toCharArray();
        while (p1 < charsArr.length ){
            if(!uniqueCharSet.contains(charsArr[p1])){
                uniqueCharSet.add(charsArr[p1]);
                p1++;
                maxLength = Math.max(uniqueCharSet.size(), maxLength);
            }else {
                uniqueCharSet.remove(charsArr[p2]);
                p2++;
            }
        }
        return maxLength;
    }
    public int lengthOfLongestSubstringBF(String s) {
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
