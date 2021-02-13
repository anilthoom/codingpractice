//https://leetcode.com/problems/shuffle-string/
package com.anilt.leetcode;

public class ShuffleString {
    public static void main(String[] args) {
        int ar[] = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        System.out.println(restoreString("KumarAnil", ar));
    }
    public static String restoreString(String s, int[] indices) {
        String result = "";
        for (int i = 0; i< indices.length; i++){
            result += s.charAt(i);
        }
        return result;
    }
}
