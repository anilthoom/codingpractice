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
        for(int i=0; i<height.length-1; i++){
            for (int j=i+1; j<height.length; j++){

            }
        }
        return area;
    }
}
