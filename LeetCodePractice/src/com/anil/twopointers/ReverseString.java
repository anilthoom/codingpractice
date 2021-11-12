package com.anil.twopointers;
//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char s[] = {'h','e','l','l','o'};
        reverseString.reverseString(s);
    }
    public void reverseString(char[] s) {
        int startPointer = 0;
        int endPointer = s.length-1;
        char temp;
        while (startPointer < endPointer){
            //Swap and change the pointers
            temp = s[startPointer];
            s[startPointer] = s[endPointer];
            s[endPointer] = temp;
            startPointer++;
            endPointer--;
        }
    }
}
