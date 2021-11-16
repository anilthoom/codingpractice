package com.anil.algo.slidingwindow;

import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/
public class PermutationInString {
    public static void main(String[] args) {
        PermutationInString permutationInString = new PermutationInString();
        System.out.println(permutationInString.checkInclusion("ab", "eidbaooo"));
    }
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Chars = new char[26];
        for(int i=0; i<s1.length(); i++){
            s1Chars[s1.charAt(i)-'a']++;
        }
        for(int i =0; i<s2.length(); i++){
            if(s1Chars[s2.charAt(i)-'a'] > 0){
                String str = s2.substring(i, i+s1.length());
                boolean found = false;
                for(int j=0; j<str.length(); j++){
                    char[] strChars = new char[26];
                    for(int k=0; k<str.length();k++){
                        strChars[str.charAt(k)-'a']++;
                    }
                    if(s1Chars[str.charAt(j)-'a'] == strChars[str.charAt(j)-'a']){
                        found =true;
                    }
                    else {
                        found = false;
                        break;
                    }
                }
                if(found)
                    return true;
            }
        }
        return false;
    }
}
