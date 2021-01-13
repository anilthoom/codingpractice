package com.anilt.problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) 
    {
    	int totalCount = returnTotalCountChar(s);
    	int charLength = s.length();
    	long repeatations = n/charLength;
    	long remainder = n%charLength;
    	System.out.println(remainder);
    	long result = repeatations * totalCount;
    	if(remainder >0)
    	{
    		totalCount = returnTotalCountChar(s.substring(0, Integer.parseInt(""+remainder)));
    		result += totalCount;
    	}
    	return result;
    }
    static int returnTotalCountChar(String s)
    {
    	int totalCount = 0;
    	for(int i=0; i<s.length(); i++)
    	{
    		if(s.charAt(i) == 'a')
    			totalCount++;
    	}
    	return totalCount;
    }


    public static void main(String[] args) throws IOException 
    {
    	String s = "abaca";
    	long n = 25;
        long result = repeatedString(s, n);
        System.out.println(result);
    }
}
