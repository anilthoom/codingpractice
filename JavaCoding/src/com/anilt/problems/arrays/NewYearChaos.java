package com.anilt.problems.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewYearChaos 
{

	public static void main(String[] args) 
	{
		//{1,2,3,4,5};
//		int[] arr = {2,1,5,3,4};
//		int[] arr = {2,5,1,3,4}; 
		int[] arr = {1, 2, 5, 3, 7, 8, 6, 4};
//		 int[] arr = {1, 2, 3, 4, 5, 6, 9, 7, 8};
		minimumBribes(arr);
	}
	//https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    static void minimumBribes(int[] q) 
    {
    	int bribeCounter = 0;
    	List<Integer> list = Arrays.stream(q).boxed().collect(Collectors.toList());
    	int numberPosition = -1;
    	for(int number=q.length; number>0; number--)
    	{
    		numberPosition = list.indexOf(number);
    		if(number-3 == numberPosition)
        	{
        		//Moved by 2
        		bribeCounter += 2;
        		list.remove(numberPosition);
        		list.add(numberPosition+2, number);
        	}
        	else if(number-2 == numberPosition)
        	{
        		//Moved by 1
        		bribeCounter += 1;
        		list.remove(numberPosition);
        		list.add(numberPosition+1, number);
        	}
        	else if(number-1 == numberPosition || number == numberPosition)
        	{
        		//At correct position
        	}
        	else
        	{
        		System.out.println("Too chaotic");
        		bribeCounter = -1;
        		return;
        	}
    	}
   		System.out.println(bribeCounter);
    }
}
