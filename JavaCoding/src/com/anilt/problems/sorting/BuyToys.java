package com.anilt.problems.sorting;

import java.util.Arrays;

public class BuyToys 
{
	public static void main(String[] args) 
	{
		int prices[] = {5, 2, 1, 8, 19, 3};
		int k = 11;
		System.out.println(maximumToys(prices, k));
	}
	static int maximumToys(int[] prices, int k) 
	{
		int noOfItems = 0;
		Arrays.sort(prices);
		for (int i : prices) 
		{
			if(k>=i)
			{
				noOfItems++;
				k = k-i;
			}
			else
			{
				break;
			}
		}
		return noOfItems;
    }
}
