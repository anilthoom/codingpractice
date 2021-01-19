package com.anilt.ds.sorting;

public class BubbleSortMain {

	public static void main(String[] args) {

		BubbleSort ob = new BubbleSort();
		int arr[] = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Array to be sorted...");
		ob.printArray(arr);

		ob.bubbleSort(arr);

		System.out.println("Sorted Array...");
		ob.printArray(arr);
		
		
		int arr2[] = { 100, 50, 300, 150, 500, 60 };
		anilBubSor(arr2);
		ob.printArray(arr2);

	}// end of method
	
	public static void anilBubSor(int arr[])
	{
		int length = arr.length;
		int temp;
		for (int i=0; i<length-1; i++)
		{
			for(int j= 0; j< length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}// end of class