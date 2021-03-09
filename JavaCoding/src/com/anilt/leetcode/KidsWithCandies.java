package com.anilt.leetcode;

import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        KidsWithCandies kidsWithCandies = new KidsWithCandies();
        int[] arr = {2,3,5,1,3};
        System.out.println( kidsWithCandies.kidsWithCandies(arr, 3));

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for(int max : candies){
            if(maxCandy < max)
                maxCandy = max;
        }
        System.out.println(maxCandy);
        boolean[] resultArray = new boolean[candies.length];
        for(int count : candies) {
            if(count >= maxCandy){
                
            }
        }
        return null;
    }
}
