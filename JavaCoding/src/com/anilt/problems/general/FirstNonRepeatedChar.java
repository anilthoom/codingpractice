package com.anilt.problems.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {
    
    public static void main(String[] args)
    {
    	System.out.println(firstNonRepeatedChar_TUNED("abcdefabcef"));
    	Map<String, Integer> mp = new HashMap<String,Integer>();
    	
    	System.out.println(31/2);
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        char c=firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable= 
                     new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        // Search characterhashtable in in order of string str
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        return null ;
    }
    public static Character firstNonRepeatedChar_TUNED(String str)
    {
    	//boolean[] asciiArr = new boolean[256]; Can be used if we are restricted to use substring and charAt etc...
    	for(int i=0; i<str.length();i++)
    	{
    		char c = str.charAt(i);
    		if(!str.substring(i+1, str.length()-1).contains(""+c))
    		{
    			return c;
    		}
    	}
    	return null;
    }
} 