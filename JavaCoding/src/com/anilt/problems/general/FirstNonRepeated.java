package com.anilt.problems.general;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {

    public static void main(String[] args)
    {
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        printFirstNonRepeatingChar(s);

        Character c=firstNonRepeatedCharacter(s);
        if (c != null)
            System.out.println("The first non repeated character is :  " + c);
        else
            System.out.println("No non repeated character in the given input");

    }
    //Better performing
    public static void printFirstNonRepeatingChar(String str)
    {
        char ch;
        String subStr;
        int counter = 0;
        for(int i = 0; i<str.length(); i++)
        {
            counter++;
            ch = str.charAt(i);
            subStr = str.substring(i+1);
            if(!subStr.contains(ch+""))
            {
                System.out.println("FIRST CHAR IS : "+ch);
                System.out.println("LOOP Count : "+counter);
                return;
            }
        }
        System.out.println("THERE IS NO UNIQUE CHAR");
    }
    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable=
                new HashMap<Character ,Integer>();
        int i,length ;
        Character c;
        length= str.length();  // Scan string and build hash table
//        System.nanoTime();
        int counter = 0;
        for (i=0;i < length;i++)
        {
            counter++;
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

        // Search characterhashtable in order of string str
        for (i =0 ; i < length ; i++ )
        {
            counter++;
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            {
                System.out.println("COUNT : "+counter);
                return c;
            }
        }
        return null;
    }
}