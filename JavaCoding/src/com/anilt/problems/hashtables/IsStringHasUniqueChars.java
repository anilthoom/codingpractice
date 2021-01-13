package com.anilt.problems.hashtables;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class IsStringHasUniqueChars 
{

	public static void main(String[] args) 
	{
		String str = "abcdedxy";
		
		/*BruteForce Method*/
		long startTime = System.nanoTime();
		System.out.println("BruteForce Method : "+ bruteForceMethod(str));
		long endTime = System.nanoTime();
		printTimeTaken(startTime, endTime);
		/*BruteForce Method*/
		
		long startTime2 = System.nanoTime();
		System.out.println("Sorting Chars Method : "+ sortingChars(str));
		long endTime2 = System.nanoTime();
		printTimeTaken(startTime2, endTime2);
		
		long startTime3 = System.nanoTime();
		System.out.println("Sorting Chars Method : "+ asciiCodesCheck(str));
		long endTime3 = System.nanoTime();
		printTimeTaken(startTime3, endTime3);
		
	}
	//Approach 3 � Use of Extra Data Structure: 
	//Time complexity : O(n)
	static boolean asciiCodesCheck(String inputStr)
	{
		boolean[] asciiBolArr = new boolean[256];
		for(int i=0; i<inputStr.length(); i++)
		{
			if(asciiBolArr[inputStr.charAt(i)])
				return true;
			else
				asciiBolArr[inputStr.charAt(i)] = true;
		}
		return false;
	}
	
//	Approach 2 � Sorting: Using sorting based on ASCII values of characters
//	Time Complexity: O(n log n)
	static boolean sortingChars(String inputStr)
	{
		char[] inputChars = inputStr.toCharArray();
		Arrays.sort(inputChars);
		for(int i=0; i<inputChars.length; i++)
		{
			if(inputChars[i] == inputChars[i+1])
				return true;
		}
		return false;
	}
	
	//Time complexity is : O(n^2)
	static boolean bruteForceMethod(String inputStr)
	{
		for(int i=0; i<inputStr.length(); i++)
		{
			for(int j=i+1; j<inputStr.length(); j++)
			{
				if(inputStr.charAt(i) == inputStr.charAt(j))
					return true;
			}
		}
		return false;
	}
	static void printTimeTaken(long start, long end)
	{
		long elapsedTime = end - start;

//        System.out.println(elapsedTime);

        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;

        System.out.println(elapsedTimeInSecond + " seconds");

        // TimeUnit
		/*
		 * long convert = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
		 * 
		 * System.out.println(convert + " seconds");
		 */
	}
}
