package com.anilt.problems.stringmanipulation;
public class StringPerm
{
    static void printStringPerm(String str, String ans)
    {
    	if(str.length() == 0)
    	{
    		System.out.println(ans);
    		return;
    	}
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            //abc : a bc
            
            String ros = str.substring(0, i)+ str.substring(i+1);
            //ab
            printStringPerm(ros, ans+ch);
        }
    }
    // Function to print all the permutations of str 
    static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
    public static void main(String[] args)
    {
        String input = "abc";
        printStringPerm(input, "");
        printPermutn(input, "");
    }
   
}