package com.anilt.problems.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class HourGlassProblem
{
    public static void main(String[] args) throws IOException 
    {
        int[][] arr = new int[6][6];
        int[] a0 = {1, 1, 1, 0, 0, 0};
        int[] a1 = {0, 1, 0, 0, 0, 0};
        int[] a2 = {1, 1, 1, 0, 0, 0};
        int[] a3 = {0, 0, 2, 4, 4, 0};
        int[] a4 = {0, 0, 0, 2, 0, 0};
        int[] a5 = {0, 0, 1, 2, 4, 0};
        
        for(int i =0; i<6; i++)
        {
        	for(int j=0; j<6; j++)
        	{
        		if(i == 0)
        			arr[i][j] = a0[j];
        		if(i == 1)
        			arr[i][j] = a1[j];
        		if(i == 2)
        			arr[i][j] = a2[j];
        		if(i == 3)
        			arr[i][j] = a3[j];
        		if(i == 4)
        			arr[i][j] = a4[j];
        		if(i == 5)
        			arr[i][j] = a5[j];
        	}
        }
        int max = hourglassSum(arr);
        System.out.println(max);
    }
    static int hourglassSum(int[][] arr) 
    {
    	int max = -1;
    	TreeSet<Integer> sortedSet = new TreeSet<Integer>();
    	for(int i =1; i<arr.length-1; i++)
    	{
    		for(int j=1; j<arr.length-1; j++)
    		{
    			max = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
    			max += arr[i][j];
    			max += arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
    			sortedSet.add(max);
    		}
    	}
    	return sortedSet.last();
    }


}
