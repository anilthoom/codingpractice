package com.anilt.problems.stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCombinations {

	public static void main(String[] args) 
	{
		String str = "abc";
		//abc acb bac bca cab cba
		//print(str, "");
		Map<String, String> hm 
        = new HashMap<String, String>(); 
		hm.put("d2_rest", "http://10.96.153.168:8082/d2-rest_20.2.0/repositories");
		hm.put("locateId", "http://10.96.153.235:8282/D2");

		hm.keySet().removeIf(k -> k.equals("locateId"));

		for (Entry<String, String> entry : hm.entrySet()) {
			String[] repoUrlArr = entry.getValue().split("/");
			for (String s : repoUrlArr) {
				System.out.println(s);
			}
		}
		
	}
	
	public static void print(String str, String ans)
	{
		if(str.length() == 0)
		{
			System.out.print(ans + " ");
			return;
		}
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			String subString = str.substring(0, i)+str.substring(i+1);
			
			
			print(subString, ans+ch);
		}
	}
	
}
