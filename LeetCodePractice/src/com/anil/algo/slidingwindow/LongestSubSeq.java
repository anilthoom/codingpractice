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
        if (s.length() == 0) {return 0;}
        int max = 0;
        Set<Character> set = new HashSet<>();
        int i =0 , j=0;
        char[] c = s.toCharArray();
        while(j < c.length) {

            if (!set.contains(c[j])) {
                set.add(c[j]);
                j++;
                max = Math.max(set.size(), max);
            }else
            {
                set.remove(c[i]);
                i++;
            }
        }
        return max;
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
