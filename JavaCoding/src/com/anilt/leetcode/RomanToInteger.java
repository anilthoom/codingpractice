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
        System.out.println(rti.romanToInt("XX"));
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
        int total = 0;
        for (int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            // Handling 1, 4, 9 scenario
            if(c == 'I' && i+1<s.length()){
                if(s.charAt(i+1) == 'V'){
                    total += 4;
                    i++;
                }
                else if(s.charAt(i+1) == 'X'){
                    total += 9;
                    i++;
                }
                else {
                    total += 1;
                }
            }
            //Handling 10, 40, 90 scenario
            else if(c == 'X' && i+1<s.length()){
                if(s.charAt(i+1) == 'L'){
                    total += 40;
                    i++;
                }
                else if(s.charAt(i+1) == 'C'){
                    total += 90;
                    i++;
                }
                else {
                    total += 10;
                }
            }
            //Handling 100, 400, 900
            else if(c == 'C' && i+1<s.length()){
                if(s.charAt(i+1) == 'D'){
                    total += 400;
                    i++;
                }
                else if(s.charAt(i+1) == 'M'){
                    total += 900;
                    i++;
                }
                else {
                    total += 100;
                }
            }
            else {
                // Get from map and add the value
                total += hashMap.get(""+c);
            }
        }
        return total;
    }
}
