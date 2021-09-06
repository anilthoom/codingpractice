package com.anilt.faang.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int arr[] = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 3};
        System.out.println("\n"+trappingRainWater.trap(arr));
    }
    public int trap(int[] height) {
        int p1 = -1;
        int p2 = -1;
        int waterBucket = 0;
        int initValue = height[0];
        // Need to do ltrim rtrim of 0


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
                System.out.print(p1+" - ");
                while(p1 >= p2){
                    waterBucket += p1 - p2;
                    i = i+1;
                    if(i >= height.length)
                        break;
                    System.out.print(p2 + "  - ");
                    p2 = height[i];
                    System.out.println(p2);
                }
                p1 = p2;
                if(i < height.length)
                    p2 = height[i+1];
            }
        }

        return waterBucket;
    }

}
