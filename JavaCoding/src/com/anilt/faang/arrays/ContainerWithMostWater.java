package com.anilt.faang.arrays;
//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int heights[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxArea(heights));
    }
    //Brut force approach
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = -1;
        for(int p1=0, p2=height.length-1; p1<height.length; p1++){

        }
        return maxArea;
    }
}
