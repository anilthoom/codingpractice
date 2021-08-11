package com.anilt.problems.arrays;

import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings3528/1
public class FrequentWordInArray {
    public static void main(String[] args) {
        String array[] = {"Anil", "Kumar", "Anil", "Shri"};
        System.out.println(mostFrequentWord(array, 4));
    }
    public static String mostFrequentWord(String arr[],int n)
    {
        Map<String, Integer> wordsCountMap = new HashMap<>();
        String commonPrefix = "";
        String word = "";
        for(int i=0; i<n; i++){
            word = arr[i];
            if (commonPrefix.isEmpty()) {
                char firstWordChars [] = word.toCharArray();
                char secondWordChars[] = arr[i+1].toCharArray();
                for(int c =0; c<firstWordChars.length; c++){

                }

            }
        }
        String result = "";
        return result;
    }
}
