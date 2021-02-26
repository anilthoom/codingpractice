package com.anilt.problems.general;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MathProblems {

	public static void main(String[] args) 
	{
		Path fileNameAndPath = Paths.get("C:\\MyWork\\OT\\LS\\DTD\\ectdox\\0000\\index-md5.txt");
		
		System.out.println(fileNameAndPath.toString());

		
		  
		  System.out.println("MathProblems of 3! is : " + factorialOptimized(3));
		  
		  //input to print Fibonacci series upto how many numbers
		  System.out.println("Enter number upto which Fibonacci series to print: ");
		  int number = new Scanner(System.in).nextInt();
		  System.out.println("Fibonacci series upto " + number + " numbers : "); // printing Fibonacci series upto number 
		  for (int i = 1; i <= number; i++) 
		  {
			//  System.out.print(fibonacci2(i) + " "); 
		  }
		  
		  System.out.println("OPTIMISED:  "+fibonacci(number));
		  System.out.println("\nAt 4 : "+fibonacci2(4));
		  
		  
		 
		
		System.out.println("MathProblems of 5! is : " + factorialOptimized(5));
	}
	 public int printFact(int num)
	    {
	    	if(num == 0 )
	    		return 1;
	    	return num*printFact(num-1);
	    }
	    public int printFactIter(int num)
	    {
	    	int result = 1;
	    	for(int i=2; i<=num; i++)
	    	{
	    		result = result*i;
	    	}
	    	System.out.println("RESULT: "+ result);
	    	return result;
	    }
	
	static int factorialOptimized(int input)
	{
		if(input > 1)
		{
			return (input*factorialOptimized(input-1));
		}
		return 1;
	}
	
	/*
	 * * Java program for Fibonacci number using recursion. * This program uses tail
	 * recursion to calculate Fibonacci number for a given number * @return
	 * Fibonacci number
	 */
	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion }
	}
	
	/*
	 * * Java program to calculate Fibonacci number using loop or Iteration.
	 * * @return Fibonacci number
	 */ 
	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) { // Fibonacci number is sum of previous two Fibonacci number
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci; // Fibonacci number }
	}
}
