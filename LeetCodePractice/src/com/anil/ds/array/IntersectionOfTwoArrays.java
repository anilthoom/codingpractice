package com.anil.ds.array;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        intersectionOfTwoArrays.intersect(nums1, nums2);
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int ans[] = new int[0];

        Arrays.fill(ans, 10);
        Arrays.fill(ans, 12);
        return ans;
    }
}
