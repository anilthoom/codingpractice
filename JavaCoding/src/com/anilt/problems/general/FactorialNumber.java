package com.anilt.problems.general;

public class FactorialNumber {
    public static void main(String[] args)
    {
        printFact(5);
//		System.out.println(printFactRecursive(5));
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
}
