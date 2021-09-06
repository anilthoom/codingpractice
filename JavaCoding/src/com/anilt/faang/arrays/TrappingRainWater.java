package com.anilt.faang.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int arr[] = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        System.out.println("\n"+trappingRainWater.trap(arr));
    }
    public int trap(int[] height) {
        int p1 = -1;
        int p2 = -1;
        int waterBucket = 0;
        ArrayList<ArrayList> bucketTuples = new ArrayList<>();
        boolean beginShow = false;
        for (int i = 0; i< height.length; i++){
            if(!beginShow && height[i] > 0 && height[i] > height[i+1] ){
                beginShow = true;
                p1 = height[i];
                i = i+1;
                p2 = height[i];
                System.out.println("STARTS HERE... "+ p1 + " At Index "+ i);
            }
            if(beginShow){
                ArrayList tuples = new ArrayList();
                System.out.print(p1);
                tuples.add(p1);
                while(p1 >= p2){
                    System.out.print(" - "+p2);
                    tuples.add(p2);
                    waterBucket += p1 - p2;
                    i = i+1;
                    if(i >= height.length){
                        bucketTuples.add(tuples);
                        break;
                    }

                    p2 = height[i];
                }
                p1 = p2;
                if(i < height.length){
                    System.out.println(" - "+p2);
                    tuples.add(p2);
                    bucketTuples.add(tuples);
                    p2 = height[i+1];
                }
            }
        }

        for(int i = 0; i< bucketTuples.size(); i++){
            ArrayList tupleArr = bucketTuples.get(i);
        }
        return waterBucket;
    }

}
