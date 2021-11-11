package com.anil.ds.array;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        intersectionOfTwoArrays.intersect(nums1, nums2);
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int ans[] = {};
        if(nums1.length <= nums2.length){
            ans = intersectFind(nums1, nums2);
        }
        else {
            ans = intersectFind(nums2, nums1);
        }
        return ans;
    }
    public int[] intersectFind(int[] smallSizeArray, int[] bigSizeArray) {
        int ans[] = {};
        List findTheseNumsList  = new ArrayList();
        for(int i=0; i< smallSizeArray.length; i++){
            findTheseNumsList.add(smallSizeArray[i]);
        }
        for(int i =0; i< bigSizeArray.length; i++){
            if(findTheseNumsList.contains(bigSizeArray[i])){
                Arrays.fill(ans, bigSizeArray[i]);
            }
        }
        return ans;
    }
}
