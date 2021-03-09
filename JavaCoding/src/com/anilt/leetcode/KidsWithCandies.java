package com.anilt.leetcode;

import java.util.ArrayList;
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
        List<Boolean> resultArray = new ArrayList<Boolean>();
        for(int i=0; i<candies.length; i++) {
            if((candies[i]+extraCandies) >= maxCandy)
                resultArray.add(true);
            else
                resultArray.add(false);

        }
        return resultArray;
    }
}
