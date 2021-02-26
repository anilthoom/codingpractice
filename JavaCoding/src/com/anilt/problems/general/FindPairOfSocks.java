package com.anilt.problems.general;

import java.util.HashMap;
import java.util.Map;

public class FindPairOfSocks {

	public static void main(String[] args) 
	{
		int arr[] = {10, 20, 10, 10, 20, 30, 40, 20, 10, 30};// Each number represents the color code of socks. i.e., 10 - is one Red color sock.
		Map<Integer, Integer> socksPairs = new HashMap<Integer, Integer>();
		for (int i =  0; i < arr.length; i++) 
		{
			int colorSock = arr[i];
			if(socksPairs.containsKey(colorSock))
			{
				//Increment if exists
				int countOfSocks = socksPairs.get(colorSock);
				countOfSocks++;
				socksPairs.put(colorSock, countOfSocks++);
			}
			else
			{
				//Add for the first time
				socksPairs.put(colorSock, 1);
			}
		}
		int totalPairs =0;
		for (Map.Entry<Integer, Integer> socks: socksPairs.entrySet()) 
		{
			int totalOfSameColor = socks.getValue();
			totalPairs += totalOfSameColor/2;
		}
		System.out.println("Totla Pairs are :"+totalPairs);
	}

}
