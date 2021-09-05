package com.anilt.faang.arrays;
//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int heights[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxArea(heights));
    }
    //Brut force approach : O(n^2)
    public int maxAreaBad(int[] height) {
        int area = 0;
        int maxArea = -1;
        for(int i=0; i<height.length-1; i++){
            for (int j=i+1; j<height.length; j++){
                int min = Math.min(height[i], height[j]);
                area = min * (j-i);
                if(maxArea < area){
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    //Optimal solution : O(n)
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = -1;
        int p1= 0, p2=height.length-1;
        while (p1 < p2){
            System.out.println(height[p1] + " "+ height[p2]);
            if(height[p1] < height[p2]){
                area = height[p1] * (p2-p1);
                maxArea = Math.max(area, maxArea);
                p1++;
            }
            else {
                area = height[p2] * (p2-p1);
                maxArea = Math.max(area, maxArea);
                p2--;
            }
        }
        return maxArea;
    }
}
