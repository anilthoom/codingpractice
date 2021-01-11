package com.anilt.problems;

public class FindNoInArray 
{

	public static void main(String[] args) 
	{
			int arr[] = {5, 34, 1,33, 8, 90, 23, 10, 22, 89 };
			int arrayLength = arr.length;
//			System.out.println(findBigNo(arr, arrayLength));
			System.out.println(findBigNoRecursively(arr, arrayLength-1));
	}
	public static int findBigNo(int arr[], int length)
	{
		int bigno = -1;
		for(int i=0; i<length ; i++)
		{
			if(arr[i] > bigno)
			{
				bigno = arr[i];
			}
		}
		return bigno;
	}
	static int peddaNumber = -1;
	public static int findBigNoRecursively(int arr[], int index)
	{
		if(index == -1)
		{
			return peddaNumber;
		}
		if(arr[index] > peddaNumber)
		{
			peddaNumber = arr[index];
		}
		findBigNoRecursively(arr, index-1);
		return peddaNumber;
	}
}