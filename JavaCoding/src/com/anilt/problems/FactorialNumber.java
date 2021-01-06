package com.anilt.problems;

public class FactorialNumber {
    public static void main(String[] args)
    {
        printFact(5);
//		System.out.println(printFactRecursive(5));
        printStringComb("abc", "");
//		printStringComb("abcdefghijklmnopqrstuvwxyz", "");
    }
    public static int printFactRecursive(int num)
    {
        if(num == 1)
        {
            return 1;
        }
        else
        {
            return num*printFactRecursive(num-1);
        }

    }
    public static void printFact(int num)
    {
        int result = 1;
        for(int i = num; i>0; i--)
        {
            result = result*i;
        }
        System.out.println(result);
    }
    public static void printStringComb(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.print(ans + " ");
            return;
        }
        //abc
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String subStr = str.substring(0, i)+str.substring(i+1);
            printStringComb(subStr, ans+ch);
        }
    }
}
