package com.anil.ds.array;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int digits[] = {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9};
//        int digits[] = {5,2,2,6,5,7,1,9};
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
            BigInteger bigInteger = new BigInteger(intStr);
            bigInteger = bigInteger.add(new BigInteger("1"));
            intStr = ""+bigInteger;
            int outArr[] = new int[intStr.length()];
            for(int i=0; i<intStr.length(); i++){
                outArr[i] = Integer.parseInt(""+intStr.charAt(i));
            }
            return outArr;
        }
    }
}
