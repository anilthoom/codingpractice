package com.anilt.problems.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings3528/1
public class FrequentWordInArray {
    public static void main(String[] args) {
        //String array[] = {"elgefh", "vuxct", "elgefh", "kmrht", "elgefh", "kmrht", "kmrht", "hjfd", "hjfd", "kmrht", "vuxct", "elgefh", "mzwlcq", "kmrht", "elgefh"};
        String array[] = {"xejdcj", "xejdcj", "lvjpb", "tmyuiu", "lvjpb", "tmyuiu", "ovoba", "lvjpb", "lvjpb", "fqhyu", "fqhyu", "tmyuiu", "xejdcj", "tmyuiu", "fqhyu", "ovoba", "xejdcj"};
        System.out.println(mostFrequentWord(array, array.length));
    }
    public static String mostFrequentWord(String arr[],int n)
    {
        Map<String, Integer> wordsCountMap = new LinkedHashMap<>();
        String word = "";
        Integer counter;
        String heroWord = "";
        Integer heroCounter = -1;
        for(int i=0; i<n; i++){
            word = arr[i];
            if(wordsCountMap.containsKey(word)){
               counter = wordsCountMap.get(word)+1;
               wordsCountMap.replace(word, counter);
               //wordsCountMap.put(word, counter);
            }
            else {
                wordsCountMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry: wordsCountMap.entrySet()) {
            System.out.println(entry.getKey() +" - "+ entry.getValue());
            if(heroCounter <= entry.getValue()){
                heroWord = entry.getKey();
                heroCounter = entry.getValue();
            }
        }
        return heroWord;
    }
}
