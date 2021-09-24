package com.anilt.faang.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int arr[] = {4,2,0,3,2,5};
        System.out.println("\n"+trappingRainWater.trap(arr));
    }
    public int trap_opt(int[] height) {
        // currentWater = min(maxL, maxR) - currentHeight
        int left=0, right=height.length-1, total=0;
        int maxLeft=0, maxRight=0;
        while (left < right){
            if(height[left] <= height[right]){


            }
        }
        return 0;
    }
    public int trap(int[] height) {
        int totalWater = 0;
        int leftP, rightP, maxLeft, maxRight, currentWater;
        for (int p = 0; p< height.length; p++){
            leftP = p;
            rightP = p;
            maxLeft =0;
            maxRight = 0;

            while (leftP >= 0){
                maxLeft = Math.max(maxLeft, height[leftP]);
                leftP--;
            }
            while (rightP < height.length){
                maxRight = Math.max(maxRight, height[rightP]);
                rightP++;
            }
            currentWater = Math.min(maxLeft, maxRight) - height[p];
            if(currentWater >0){
                totalWater += currentWater;
            }
        }
        return totalWater;
    }

}
