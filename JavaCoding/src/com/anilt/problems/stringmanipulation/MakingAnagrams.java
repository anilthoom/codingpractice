package com.anilt.problems.stringmanipulation;

public class MakingAnagrams {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a = "cyefc";
		String b ="aecxcfz";
		int result = makeAnagram(a, b);
		System.out.println(result);
	}
	static int makeAnagram(String a, String b)
	{
		int aNonExistCount = 0 ;
		for(int i =0; i<a.length(); i++)
		{
			char ch = a.charAt(i);
			int indexNumber = b.indexOf(ch);
			if(indexNumber > -1)
			{
				String firstToken = b.substring(0, indexNumber);
				String secondToken = b.substring(indexNumber+1, b.length());
				b = firstToken+secondToken;
			}
			else
			{
				aNonExistCount++;
			}
		}
		return (b.length()+aNonExistCount);
	}
}
