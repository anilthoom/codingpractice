//https://leetcode.com/problems/roman-to-integer/
package com.anilt.leetcode;

import java.util.HashMap;

/**
 *  Symbol       Value
 *  I             1
 *  V             5
 *  X             10
 *  L             50
 *  C             100
 *  D             500
 *  M             1000
 *
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        System.out.println(rti.romanToInt("XIII"));
    }
    public int romanToInt(String s) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        for (int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == 'I'){
                //Check for next char if exists
            }
            else if(c == 'X'){
                //Check for next char if exists and increment i
            }
            else if(c == 'C'){
                //Check for next char if exists and increment i
            }
            else {
                // Get and add the value
            }

        }
        return 0;
    }
}
