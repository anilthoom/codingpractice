package com.anil.algo.twopointers;

import java.util.StringTokenizer;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char s[] = {'h','e','l','l','o'};
        //reverseString.reverseCharString(s);
        String str = "Let's take LeetCode contest";
        //System.out.println(reverseString.reverseWords(str));
        System.out.println(reverseString.reverseWordsOptimal(str));
    }
    //https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWordsOptimal(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        StringBuilder stringBuilder = new StringBuilder();
        while(stringTokenizer.hasMoreTokens()){
            StringBuilder temp = new StringBuilder(stringTokenizer.nextToken());
            temp.reverse();
            stringBuilder.append(temp+" ");
        }
        return stringBuilder.substring(0, s.length());
    }
    public String reverseWords(String s) {
        String ans = "";
        String strs[] = s.split(" ");

        for (String str:strs) {
            char chArray [] = new char[str.length()];
            str.getChars(0, str.length(), chArray, 0);
            ans = ans+reverseString(chArray)+" ";
        }
        return ans.trim();
    }
    public String reverseString(char[] s) {
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
        String reversedString="";
        for(char c: s){
            reversedString += ""+c;
        }
        return reversedString;
    }

    public void reverseCharString(char[] s) {
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
