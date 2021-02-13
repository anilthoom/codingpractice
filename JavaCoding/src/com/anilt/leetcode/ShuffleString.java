//https://leetcode.com/problems/shuffle-string/
package com.anilt.leetcode;

public class ShuffleString {
    public static void main(String[] args) {
        int ar[] = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString("CodeLeAt", ar));
    }
    public static String restoreString(String s, int[] indices) {
        String result = "";
        char resultCharArr[] = new char[indices.length];
        for (int i = 0; i< indices.length; i++){
            System.out.println(indices[i]);
            resultCharArr[indices[i]] = s.charAt(indices[i]);

        }
        return result;
    }
}
