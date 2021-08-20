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
        String word = "";
        Integer counter;
        for(int i=0; i<n; i++){
            word = arr[i];
            if(wordsCountMap.containsKey(word)){
               counter = wordsCountMap.get(word)+1;
               wordsCountMap.put(word, counter);
            }
            else {
                wordsCountMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry: wordsCountMap.entrySet()) {
            System.out.println(entry.getKey() +" - "+ entry.getValue());
        }
        String result = "";
        return result;
    }
}
