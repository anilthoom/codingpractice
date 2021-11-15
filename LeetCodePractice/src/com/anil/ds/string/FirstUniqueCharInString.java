package com.anil.ds.string;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        System.out.println(firstUniqueCharInString.firstUniqChar("leetcode"));
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
