package com.anilt.leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(5));
    }
    public int climbStairs(int n) {
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
        int x=0;
        int y=1;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=x+y;
            x=y;
            y=ans;
        }
        return ans;
    }
}
