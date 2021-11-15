package com.anil.ds.string;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        System.out.println(firstUniqueCharInString.firstUniqChar("aabb"));
    }
    public int firstUniqChar(String s) {
        String charToSearch = "";
        for(int i=0; i<s.length(); i++){
            charToSearch = s.substring(i, i+1);
            if(!s.substring(i+1, s.length()-1).contains(charToSearch))
                return i;
        }
        return -1;
    }
}
