package com.anilt.problems.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLeftRotations {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int noOfRot = 4;
		arr = rotLeft(arr, noOfRot);
	}
	static int[] rotLeft(int[] a, int d) 
	{
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		Collections.rotate(list, -d);

		int[] result = new int[a.length];
		int i = 0;
		for (Integer integer : list) 
		{
			result[i] = integer;
			System.out.print(integer+" ");
			i++;
		}
		return result;
    }
	
	static void rotateLeft(int[] a, int d)
	{
		
	}

}
