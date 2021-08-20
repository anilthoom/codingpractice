package com.anilt.google;

import java.util.Arrays;

public class FindTripletsWithZero {
    public static void main(String[] args) {
        FindTripletsWithZero findTripletsWithZero = new FindTripletsWithZero();
        int arr[] = {0, -1, 2, -3, 3};
        System.out.println(findTripletsWithZero.findTriplets(arr, arr.length));

    }
    public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0; i<n; i++){

            if(arr[i] + arr[i+1] + arr[i+2] == 0)
            {
                return true;
            }
            System.out.println(arr[i] + " ");
        }
        return false;
    }
}
