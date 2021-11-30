package com.anil.math;
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
public class PowerOfThree {
    public static void main(String[] args) {
        PowerOfThree powerOfThree = new PowerOfThree();
        System.out.println(powerOfThree.isPowerOfThree(2147483647));
    }
    public boolean isPowerOfThree(int n) {
        if(n==1 || n==3)
            return true;
        else if(n%3 != 0)
            return false;
        for(int i=3; i<n; i=i*3){
            if(i*3 == n)
                return true;
        }
        return false;
    }
}
