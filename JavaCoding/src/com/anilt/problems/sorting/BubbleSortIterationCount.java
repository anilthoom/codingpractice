package com.anilt.problems.sorting;

public class BubbleSortIterationCount 
{
	public static void main(String[] args) 
	{
//		int arr[] = {5, 4, 2, 3, 1, 6};
//		int arr[] = {3, 2, 1};
		int arr[] = {7, 1, 3, 2, 4, 5, 6};
		countSwaps(arr);
	}

	// Complete the countSwaps function below.
    static void countSwaps(int[] a) 
    {
    	int count = 0;
    	for(int i=0; i<a.length; i++)
    	{
    		for(int j=i+1; j<a.length; j++)
    		{
    			if(a[i] > a[j])
        		{
        			a[i] = a[i]+a[j];
        			a[j] = a[i]-a[j];
        			a[i] = a[i]-a[j];
        			count++;
        		}	
    		}
    	}
    	System.out.println("Array is sorted in "+count+" swaps.");
    	System.out.println("First Element: "+a[0]);
    	System.out.println("Last Element: "+a[a.length-1]);
    }
}
