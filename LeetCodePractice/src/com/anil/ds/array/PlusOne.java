package com.anil.ds.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int digits[] = {1,2,3,4, 8};
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

        }
        return null;
    }
}
