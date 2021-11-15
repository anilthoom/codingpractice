package com.anil.ds.string;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        System.out.println(firstUniqueCharInString.firstUniqChar("leetcode"));
    }
    public int firstUniqCharOptimal(String s) {
        int[] chars = new int[128];
        for(int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            chars[c]++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(chars[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
    public int firstUniqChar(String s) {
        String charToSearch = "", remainingSubStr = "";
        for(int i=0; i<s.length(); i++){
            charToSearch = s.substring(i, i+1);
            remainingSubStr = s.substring(0, i) + s.substring(i+1, s.length());
            if(!remainingSubStr.contains(charToSearch))
                return i;
        }
        return -1;
    }
}
