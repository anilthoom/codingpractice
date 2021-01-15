package com.anilt.problems.greedy;

import java.util.Arrays;
import java.util.TreeSet;

public class AbsoluteDiffInArrOfElements {

	public static void main(String[] args) 
	{
		int arr[] = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		System.out.println(minimumAbsoluteDifference(arr));
	}
	static int minimumAbsoluteDifference(int[] arr) 
	{
		Arrays.sort(arr);
		int result = Math.abs(arr[0]-arr[1]);
		for (int i = 1; i < arr.length; i++) 
		{
			result = Math.min(result, Math.abs(arr[i]-arr[i-1]));
		}
		return result;
    }
	static int minimumAbsoluteDifference_1(int[] arr) 
	{
		int result = Math.abs(arr[0]-arr[1]);
		for (int i = 0; i < arr.length; i++) 
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(Math.abs(arr[i]-arr[j]) < result)
					result = Math.abs(arr[i]-arr[j]);
			}
		}
		return result;
    }
	static int minimumAbsoluteDifference_2(int[] arr) 
	{
		TreeSet<Integer> sortedInts = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			for(int j= i+1; j<arr.length; j++)
			{
				sortedInts.add(Math.abs(arr[i]-arr[j]));
			}
		}
		return sortedInts.first();
    }
}
