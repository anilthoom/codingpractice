package com.anilt.problems.stringmanipulation;

import java.util.Arrays;
import java.util.HashMap;

public class SpcialString {

	public static void main(String[] args)
	{
		String s = "ccacacabccacabaaaabbcbccbabcbbcaccabaababcbcacabcabacbbbccccabcbcabbaaaaabacbcbbbcababaabcbbaaababababbabcaabcaacacbbaccbbabbcbbcbacbacabaaaaccacbaabccabbacabaabaaaabbccbaaaabacabcacbbabbacbcbccbbbaaabaaacaabacccaacbcccaacbbcaabcbbccbccacbbcbcaaabbaababacccbacacbcbcbbccaacbbacbcbaaaacaccbcaaacbbcbbabaaacbaccaccbbabbcccbcbcbcbcabbccbacccbacabcaacbcaccabbacbbccccaabbacccaacbbbacbccbcaaaaaabaacaaabccbbcccaacbacbccaaacaacaaaacbbaaccacbcbaaaccaabcbccacaaccccacaacbcacccbcababcabacaabbcacccbacbbaaaccabbabaaccabbcbbcaabbcabaacabacbcabbaaabccabcacbcbabcbccbabcabbbcbacaaacaabbbabbaacbbacaccccabbabcbcabababbcbaaacbaacbacacbabbcacccbccbbbcbcabcabbbcaabbaccccabaabbcbcccabaacccccaaacbbbcbcacacbabaccccbcbabacaaaabcccaaccacbcbbcccaacccbbcaaaccccaabacabcabbccaababbcabccbcaccccbaaabbbcbabaccacaabcabcbacaccbaccbbaabccbbbccaccabccbabbbccbaabcaabcabcbbabccbaaccabaacbbaaaabcbcabaacacbcaabbaaabaaccacbaacababcbacbaacacccacaacbacbbaacbcbbbabccbababcbcccbccbcacccbababbcacaaaaacbabcabcacaccabaabcaaaacacbccccaaccbcbccaccacbcaaababaacbccbbbabccbaababcaabaaabcbaacccaccbcccccbabbbbacbaacbcaaaabbccbbbbbaccabcabcbcbbcbcbbbabcacbabbabbaabaabbccbbaabbbaacacacacbcccbcbbccaaaabaaabccaccbbabccabbabccabaaabcabcbabbabcbccabcbababccbcabaacaaccaacaccacaaccbbbabccbacbababbacbaccbbbcabbcaabcabbcabacbaccaaaaaacaabaaacbbcbcbabacaaaaaaaacabccacbcbcbbcccbbcbacccaccbbcbccaaccacaacbacccbcbaccccccbcaccbbbababbbbacaacabbbbcaacacabacabbcaacbcbbbabbccbcaaabcbbacccaaccbabcbabcbcccccbbaabbabccabcacacaccbaaacaaaaabacccbbaacacaaaacbcccbabcbcbbbccbcbbacabcbcaaabbaaacbcbcaacccabbcbcaaabacaaaabbabbbaaccbccbabccbbabbbbbabbbbaccaaaaacbacccacbccccabcccbcccbcbabcbbcabbcbbbcaabcbbccbcccbccaacacbbabbccbbcbbabaacaaabbbcaabcbcbacabcbacbbcaaacccbbcaaccbcbcabacaccbbbcaaaaaccbcaacbbbabccaabcccbcbcbbaaacbabbabacabbbabacaccabbbccbcaabcacccabacccccabacabaacabcaaababacbbbbbcaaccbcbaccacaabbabaabababaababbabbbcbbccaccbcbabcaaabaabbccbaabccabcbcbbccbbcaccabcbabababacbbcabbaaacbbaacbccbbabccaacbcacbccbaccbbcbcbaaabcccabbbaaaccbbaacbbabbbcabbaaaaabacbabbaacabbcbbbacbcabcaacbcacabbbcccabcbbaabacabbccacbabcbacaccacaabaaccabcacacaabaccaaabababbcccccccbbbccccacbabcacaccbbaaccbaaccaaccbbbbbacccccaaacabccbacabbcacacaacbbaabacbabcabbcbcbbcbcaaaccbbbacacabaabaacbaaabbaccbccbbccbabcbabcccaaaaabbccaaabcbbccabacacbababbbccaaccccacccaaaacbbaccbabacabbcbbbacbcaacacaabbaacbaccaabaababacabbaccaacbcccacaacbcbaaaacbcaabaacacbbccaacbccabccaacabaccabacbbccaabcaacccccccbbccbcbabbaabbcbbacaaccbbbaaabcbacabaaababbaccabbacacacbaaabcbbcbbabbbaabcacbcacbaabccbbbaacbcccababbcbaabcabbacabbaabccbccabbaccbbacababcaccbabaabbbbacacbbcbaacaacbacaaabbcabaabccacbbaacbbcbaaaaccbcbbcbcbabbabcacabbbbaaabacbbabccbaccaacbabcacbaacaaccbcbaabcabccacaacacbbabbbbbcabbccbbcababccbcbbbcccbcccabbabccbcbaacbbbbbbabaaabacbabcabbbccbcaabccccbccbbacbbbcbaaacabcacccabcabcaccaacbcaabbbccacabcbccbabbbcbabaccbcaaacccbabaababacbaaabcabbcbacaccbcaaacccaaaaaabababccbaaccccabaccacbbccbababacababacaaababccccbbccaccababcbbcccbbccacaccbbbacaccacbcaaaaaaccbcabbbbccbbbcbbaaaaccaaabbaababccbcabccbbacbcbcaaacbacbbbaaacabccbbababcabbcabbaabaccbccbcccccbbabcbbacaccccccabbabcbcbccbabcbbbcaaaccababbcaabaabcbbccababbbcaacbbbbbaacaaaaccccaacaabaaabcaccbaacacccccababcbaababcccabababbcabcbccabacacacbcabcbbbccbabacbaabbcaccbbaababbbbaaccbabbbabbbacbabccacbbacbacccacaaccacaababcaccbaaabcccbacbaaaacaaabcbbcccaabccabcacacbabaaacacacaacaabbbaccbaababaabbbcbbabbbcccbacabccbccaccbcaccaababaccccbbaaccbcabcaacbbbbbaabbabbabcbcccccbcabcabccbbbbcbbbcbbcbccccaccacacaaabacaacbcbcaababbacccabbcaabacabbcbacbbabaaabaccbbbcccabbbbbaaacbaabaabbbababbcbabbabbccabaaacccabbbabbcbbacbabbccccaacbaacbacaacbcbacaaccabcabbabbacaabcabacccaccbcbbbbbbbacccbcbbaaabbcccaaabbccccccccabacbbcaaacaabcacacbcccbaacccbbabcaaaabbaacaaabbacbbccaaaacabbcacabcacaaaacaabcbaaaaaccaabbbaaabacccaccaabbcaacbbbcbbbcaccabbcaccbbaccbacbabcbbabacaabccbaccabbcbacbcccaaabbaaababbcaacccbaccabacaacacaacababbbaabcbaacacbaaaacabbaabcbbacbbbbccabbbcaaacbcccabaccbbccacbacbacccccbcabbbaacaabcacbacccacbcaaccaccacbbbabaaabccababbcaacabbcccabbabcacacbabbacbcbcbbbcaccbaabcbaccaacaababcbcccaacbbbaccabbcaabccaaccabbabbbbcbbabbbaacaaabbbbbabcbbcbbcaccccababcccbcbbacccbcccbcaaaacbaccabcaabbccaabbbaacccabbaccbacabbaabaaabacaaaaaaababacccbacacbbccacacabaabccabbbbaabcabbcbccacbccaacaaaaccbbccabaabccbbcccbcccaabaaabaacabbbbcbccbbbacccacaaaaabaccccbbbcbabbbcaacacabcaacaabbbcaabcacccbcbcacaccaacccbbcaabbcbbbcabaaaccbbbbabacbabccbcbccababababbbbcabaccabcaccaaabbabacccacaaccbbbaacaacbcbbababbcbccccbcabcbbcbbbbccccbbcaacbaaaabacaaaccccabcaaccaabcbcccacbcbbcaacbabbcacbcaccbcbaccaababbccbccbcbabcaaabaccaacccacbbacbaacbaabbabbccbcaccaabcbacababaaccbacccbbbabaabbacbbbbbabababccaaccaaaccbbbbbbacaacbcbabbabccacacbaabaccbaccbcbbcbaccbaaccacaabbccbbccbaaaccbbacaaaccbcabcacbacbaacbccaccaccabbacaaacbcbcbaacbacaaaccbacacacacaacaccaaacababcaaaacbbbacccabaabbcbbcbacbcccbbaaaccbaacacbccacccbcbccacbcbcaacccbbbaaaaacbcbacbaabccaababbcccbaaabcacaabbbcccbaaaaababaaccbabbbcabcbcaabcacccccbbacababccbcbabcbcaccbbaaaccbababbbabcaccabbabcbaaabccabccbacaaabcaccbccaabaccccbbbbaaaaaababcacaaabcbaaccacbbcbccababacaaacbaabccbcbaccaacbbbbcbacabcccccbaaabcccbaaaacbacbbccbabaccaccacabaaccbcabbbabbabccaabcaabacccabccbcbaacbcbbbbcaaaccbaacabbaaccabacbacbcbabcaaaaaabaacaacccabccccbabcbbbbbaaccbcaacabaacbbaacccaccaacccbbaababacaababbbaccbcaabacacbcbbbcbcbacccaabacbcbabbbbccacababbacabbbcbbcabbcaaacaaccbbaacbccbcbabcacaaacbaabbaccacbbbaacabaaaababbbaacaaccccccbbcacbccacbacaababbabcccababccaacacbabccbbcbbcbaaaabacbacaabcccaacccbacccccbbbcaaaccaabcbbacbbccaacccbabccababcccbabcaaacacaacaacbbbcacabaccccabbaaccacacccbcabbcccbaacacbccabcacccaacbcabccabbacbbccbababaaaabcaabbcaccbaaaaabaabbabcaacbacacccaccbcabccccacccccabcbaccbcbbcabcacbacaaaccacbbbbbcbbabcbbbcacaccabbbbbaccabaaacaccbccbbcccbacbcbcaaababbbbbabaaacacbcbbbbacabbbcccccbbbaabcbbabbaacbcacbccbcabcaaaabccacaccacbcabbbaccbcbabaaabcabcaabbaabbcbbcabaccbcbccbbaccaaaababbacbcabbbcbacccaaabbccaabbabbacbbabbbacbacbcaabaaacccbbabbaacbbbcbbabbaacacabaaccbacaacbcaababcbababaaababaabbbbbbacbbaabaabccbbababaabcbcabcbcbacbccaaccbababbbaccaabaaaacbaabcccbacaaabccbbcccabccabbcacabcbbcabcbacacaccaccbbcbabcbbabbbbbcabbbcabaaabbaabcbabbaabbaabcccbacbcababcabcccacbcccbbbcbaacbacccbcacacbabcbaccabcaaccacaabbcacabccaaccccbabbcabcbbbabbabaabbccbcaacccaaccbcbccccbaaaabccacbcccccabaccabbacccbbbacbaabbbcccbacabbcbabbcbacbaaccbacaaaaaabbcbccccabccacabacabacbccbaaaacbcbbbbcababbbacbbbccbaaababaa";
		long startTime = System.currentTimeMillis();
	//	s = "ccacccac";
		System.out.println(substrCount(s.length(), s));
		System.out.println("Total Time in ms : "+ (System.currentTimeMillis()-startTime));
		//String str = "mnonopoo";
		//System.out.println(substrCount(str.length(), str));
//		isSpecialString("a");
	}
	static boolean isSpecialStr(String str)
	{
		int strLength = str.length();
		int middle = strLength/2;
		int modulo = strLength%2;
		
		if(strLength == 1)
		{
			return true;
		}
		else if(strLength == 2 )
		{
			if(str.charAt(0) == str.charAt(1))
			{
				return true;
			}
			else
				return false;
		}
		else if(modulo == 1 )
		{
			//Odd chars
			str = str.substring(0, middle)+str.substring(middle+1);
		}
		char[] charsArr = str.toCharArray();
		Arrays.sort(charsArr);
		if(charsArr[0] == charsArr[charsArr.length-1])
		{
			return true;
		}
		return false;
	}
	static long substrCount(int n, String s)
	{
		int counter = n;
		String subStr = "";
		boolean latest = false;
		for(int i = 0; i < n; i++)
		{
			int breakAt = 0;
			boolean onceBroken = false;
			for(int j=i+2; j<=n; j++)
			{
				latest = false;
				subStr = s.substring(i, j);
				if(isSpecialStr(subStr))
				{
//					System.out.println(subStr);
					breakAt = 0;
					counter++;
					latest = true;
				}
				else if(!latest && breakAt == 0 && !onceBroken)
				{
					breakAt = (subStr.length()*2)-1;
					onceBroken = true;
				}
				else if(!latest && subStr.length() >= breakAt && onceBroken)
				{
					break;
				}
			}
		}
		
		return counter;
	}
	static HashMap<String, Boolean> specialStringsMap = new HashMap<String, Boolean>();
	static long substrCountOLD(int n, String s) 
	{
		int counter = 0, memoryCtr =0;
		String substr =null;
		for(int i=0; i<n; i++)
		{
			for(int j=n; j>i; j--)
			{
				substr = s.substring(i, j);
				if(specialStringsMap.containsKey(substr))
				{
					memoryCtr++;
					counter++;
				}
				else if(isSpecialString(substr))
				{
					counter++;
				}
			}
		}
		System.out.println(memoryCtr);
		return counter;
	}
	
	/*
	 * String is special if it is : aabaa, aba, aa, a, b, bab, bbabb, aa, bb, cc
	 */
	static boolean isSpecialString(String str)
	{
		boolean[] asciiArr = new boolean[256];
		asciiArr[str.charAt(0)] = true;
		int strLength = str.length();
		int middle = strLength/2;
		for(int i=0; i<strLength; i++)
		{
			if(i != middle && strLength%2 == 1)
			{
				if(!asciiArr[str.charAt(i)])
					return false;
			}
			else if(strLength%2 == 0)
			{
				if(!asciiArr[str.charAt(i)])
					return false;
			}
		}
//		System.out.println(str);
		specialStringsMap.put(str, true);
		return true;
	}
	static boolean isPalindrome(String str)
	{
		for(int i =0, j=str.length()-1; i<str.length(); i++)
		{
			if(i<j && str.charAt(i) == str.charAt(j))
			{
				j--;
			}
			else if (i >= j)//either crossed at even digits (OR) single char
			{
				System.out.println(str);
				return true;
			}
			else 
			{
				return false;
			}
		}
		return false;
	}

}
