package com.anil.ds.string;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagramx", "nagaram"));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int charS [] = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            charS[c-'a']++;
        }
        int charT [] = new int[26];
        for (int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            charT[c-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(charS[c-'a'] != charT[c-'a'])
                return false;
        }
        return true;
    }
}
