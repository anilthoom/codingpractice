package com.anil.ds.string;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        System.out.println(firstUniqueCharInString.firstUniqeCharOptimal("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeXleetcode"));
    }
    public int firstUniqeCharOptimal(String s) {
        int[] chars = new int[128];
        int counter = 0;
        for(int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            chars[c]++;
            counter++;
        }

        for(int i = 0; i < s.length(); i++) {
            counter++;
            if(chars[s.charAt(i)] == 1) {
                System.out.println("COUNTER : "+counter);
                return i;
            }
        }
        System.out.println("COUNTER : "+counter);
        return -1;
    }
    public int firstUniqChar(String s) {
        String charToSearch = "", remainingSubStr = "";
        int counter = 0;
        for(int i=0; i<s.length(); i++){
            counter++;
            charToSearch = s.substring(i, i+1);
            remainingSubStr = s.substring(0, i) + s.substring(i+1, s.length());
            if(!remainingSubStr.contains(charToSearch)){
                System.out.println("COUNTER : "+counter);
                return i;
            }

        }
        System.out.println("COUNTER : "+counter);
        return -1;
    }
}
