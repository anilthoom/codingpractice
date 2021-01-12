/*
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 * 
 */
package com.anilt.problems.stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ValidString {

	public static void main(String[] args) 
	{
		String input = "aaaabb";
		System.out.println(isValid(input));
	}
	static String isValid(String s) 
	{
		if(s.length() == 0)
			return "NO";
		if(s.length() == 1)
			return "YES";
		Map<String, Integer> charMap = new HashMap<String, Integer>();
		for(int i=0; i<s.length(); i++)
		{
			String str = ""+s.charAt(i);
			if(charMap.containsKey(str))
			{
				int total = charMap.get(str);
				total = total+1;
				charMap.put(str, total);
			}
			else
			{
				charMap.put(str, 1);
			}
		}
		
		Set<Entry<String,Integer>> entries = charMap.entrySet();
		int base = getBase(entries);
		if(base == -1)
			return "NO";
		for (Entry<String, Integer> entry : entries) // 1(3), 2, 2, 2, 
		{
			int currentValue = entry.getValue();
			if(isDiffMoreThanOne(base, currentValue, charMap.size()) || (exception > 1))
				return "NO";
		}
		return "YES";
    }
	static int getBase(Set<Entry<String,Integer>> entries)
	{
		int counter = 0;
		int first=0, second=0, third=0;
		for (Entry<String, Integer> entry : entries) // 1(3), 2, 2, 2, 
		{
			int currentValue = entry.getValue();
			counter++;
			if(counter == 1)
				first = currentValue;
			else if(counter == 2)
				second = currentValue;
			else
			{
				third = currentValue;
				break;
			}
		}
		int base = -1;
		if(first == second || first == third || entries.size() == 2)
		{
			base = first;
		}
		else if(second == third)
		{
			base = second;
		}
		else
		{
			base = -1;
		}
		return base;
	}
	static int exception = 0;
	static boolean isDiffMoreThanOne(int base, int currentValue, int mapSize)
	{
		if( base == currentValue )
		{
			return false;
		}
		else if(currentValue ==1 || currentValue== base+1 )
		{
			exception++;
			return false;
		}
		else
			return true;
	}
}
