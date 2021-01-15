package com.anilt.problems.hashtables;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;


public class RansomeNote 
{
	public static void main(String[] args) 
	{
		String mag  = "give me one  today night me";
		String[] magazine = mag.split(" ");
		
		String nt = "give me one me grand today";
		String[] note = nt.split(" ");
		checkMagazine(magazine, note);
		
	}
	// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) 
    {
    	Hashtable<String, Integer> magKeysCount = new Hashtable<String, Integer>();
    	System.out.println(magKeysCount);
    	addKeyValues(magKeysCount, magazine);
    	System.out.println(magKeysCount);
    	
    	String found = "No";
    	for (String txt : note) 
    	{
    		
    		if(magKeysCount.containsKey(txt))
    		{
    			int count = magKeysCount.get(txt);
    			if(count > 1)
    			{
    				count = count-1;
    				magKeysCount.put(txt, count);
    			}
    			else if(count ==  1)
    			{
    				magKeysCount.remove(txt);
    			}
    			found = "Yes";
    		}
    		else
    		{
    			found = "No";
    			break;
    		}
		}
    	
    	System.out.println(found);
    	
    }
    
    static void addKeyValues(Hashtable<String,Integer> ht, String[] arr)
    {
    	for (String mag : arr) 
    	{
    		if(ht.containsKey(mag))
    		{
    			int count = ht.get(mag);
    			ht.put(mag, count+1);
    		}
    		else
    		{
    			ht.put(mag, 1);
    		}
		}
    }
}
