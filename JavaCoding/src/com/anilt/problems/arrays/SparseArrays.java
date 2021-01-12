package com.anilt.problems.arrays;

import java.util.Arrays;

public class SparseArrays
{

	public static void main(String[] args) 
	{
		String[] strs = {"abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf"};
		String[] queries = {"abcde","sdaklfj","asdjf","na","basXXdn"};
		matchingStrings(strs, queries);
	}
	static int[] matchingStrings(String[] strings, String[] queries) 
	{
		Arrays.sort(strings);
		Arrays.sort(queries);
		int[] result = new int[queries.length];
		for (int i=0; i< queries.length; i++) 
		{
			String qry = queries[i];
			int count = 0;
			for (String str : strings) 
			{
				if(qry.equals(str))
				{
					count++;
				}
			}
			result[i] = count;
		}
		return result;
    }

}
