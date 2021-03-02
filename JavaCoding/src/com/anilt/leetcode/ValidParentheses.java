package com.anilt.leetcode;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(vp.isValid(s));
    }
    public boolean isValid(String s) {
        byte bArr[] = s.getBytes();
        for(byte b: bArr){
            System.out.println(b);
        }
        return false;
    }
}
