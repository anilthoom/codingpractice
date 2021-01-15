package com.anilt.ds.searchsort;


public class BinarySearchTest 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[25];
		for (int i =0; i<arr.length; i++) 
		{
			arr[i] = i+100;
		}
//		int foundAtIndex = binarySearch(arr, 121, 0, arr.length-1);
		int foundAtIndex = binarySearch(arr, 109);
		System.out.println("Value found at : "+ foundAtIndex);
	}
	//Method with iteration.
	private static int binarySearch(int[] arr, int value)
	{
		int lowValue = 0; int highValue = arr.length-1;
		while (lowValue <= highValue)
		{
			int midValue = lowValue + (highValue - lowValue)/2;
			
			// Check if it is present in the middle
			if ( arr[midValue] ==  value)
			{
				return midValue;
			}
			//Less --> Move right
			if (arr[midValue] < value)
			{
				lowValue = midValue +1;
			}
			
			//Big --> Move left
			else if (arr[midValue] > value)
			{
				highValue = midValue - 1; 
			}
		}
		return -1;
	}
	
	// Recursive method
	private static int binarySearch(int[] arr, int value, int lowValue, int highValue) 
	{
		// Where array has only one element
		if(highValue >= lowValue)
		{
			int midValue = lowValue + (highValue - lowValue)/2; //explore what is happening.
			//Found mid of the array itself
			if(arr[midValue] == value)
			{
				return midValue;
			}
			//If mid value is less, that means it can exists to right side only. 
			if(arr[midValue] < value)
			{
				return binarySearch(arr, value, midValue+1, highValue);
			}
			//If mid value is greater, means it can exists to the left side only.
			else if(arr[midValue] > value)
			{
				return binarySearch(arr, value, lowValue, midValue-1);
			}
			return midValue;
		}
		return -1;
	}
	
}
