package com.anilt.google;

import java.util.Arrays;

public class FindTripletsWithZero {
    public static void main(String[] args) {
        FindTripletsWithZero findTripletsWithZero = new FindTripletsWithZero();
        int arr[] = {-2, -1, 2, -3, 3, -1, 0};
        System.out.println(findTripletsWithZero.findTriplets(arr, arr.length));

    }
    public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            for(int j=i+2; j<n; j++){
                if(arr[i] + arr[i+1] + arr[j] == 0){
                    return  true;
                }
            }
        }
        return false;
    }
}
