package com.anil.ds.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int digits[] = {5,6,2,0,0,4,6,2,4,9};
        plusOne.plusOne(digits);
        System.out.println();
    }
    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length-1];
        if( lastDigit < 9){
            lastDigit++;
            digits[digits.length-1] = lastDigit;
            return digits;
        } else {
            String intStr = "";
            for(int i =0; i<digits.length; i++){
                intStr +=""+digits[i];
            }
            long result = Long.parseLong(intStr);
            result++;
            intStr = ""+result;
            int outArr[] = new int[intStr.length()];
            for(int i=0; i<intStr.length(); i++){
                outArr[i] = Integer.parseInt(""+intStr.charAt(i));
            }
            return outArr;
        }
    }
}
