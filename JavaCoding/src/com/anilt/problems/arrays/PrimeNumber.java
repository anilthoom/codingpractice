package com.anilt.problems.arrays;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int[] a = {12, 5, 7, 25, 169};
		for (int i : a) 
		{
			System.out.println(primality(i));
		}
//		System.out.println(isPrime(169));
	}
	static String primality(int n) 
    {
    	if(n <= 1 )
    	{
    		System.out.println("Not prime");
    		return "Not prime";
    	}
    	if( n <=3 )
    	{
    		System.out.println("Prime");
    		return "Prime";
    	}
    	if(n % 2 == 0 || n%3 == 0)
    	{
    		System.out.println("Not prime");
    		return "Not prime";
    	}
    	for(int i= 5; i*i <= n; i=i+6)
    	{
    		if(n%i ==0 || n%(i+2) ==0)
    		{
    			System.out.println("Not prime");
    			return "Not prime";
    		}
    		
    	}
    	return "Prime";
    }
	static boolean isPrime(int n) 
    { 
        // Corner cases 
        if (n <= 1) return false; 
        if (n <= 3) return true; 
      
        // This is checked so that we can skip  
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
    } 
    static String primalityOofN(int n) 
    {
    	if(n <= 1 )
    	{
    		return "Not prime";
    	}
    	if( n <=3 )
    	{
    		return "Prime";
    	}
    	for(int i =2; i<n-1; i++)
    	{
    		if(n % i == 0)
    		{
    			return "Not prime";
    		}
    	}
    	return "Prime";
    }

}
