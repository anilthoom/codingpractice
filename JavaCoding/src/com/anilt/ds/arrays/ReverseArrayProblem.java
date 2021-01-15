package com.anilt.ds.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayProblem 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,4,3,2};
		reverseArray(arr);
	}
	static int[] reverseArray(int[] a) 
	{
		int[] resultArr = new int[a.length];
		int count =0;
		for(int i = a.length-1; i>=0; i--)
		{
			resultArr[count] = a[i];
			count = count + 1;
		}
		return resultArr;
    }
}
