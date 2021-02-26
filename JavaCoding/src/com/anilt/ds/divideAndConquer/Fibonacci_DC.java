package com.anilt.ds.divideAndConquer;

public class Fibonacci_DC {

	public int CalculateFibonacci(int n) {
		if (n < 1) {
			System.out.println("Please enter a positive number"); 
			return Integer.MIN_VALUE;
		}else if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;     
		}else  {
			return CalculateFibonacci(n-1) + CalculateFibonacci(n-2);
		}
	}// end of method

	
	public static void main(String[] args) {
		Fibonacci_DC fib = new Fibonacci_DC();
		System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(5));
		System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(6));
		
//		System.out.println("ANIL : fib : ---->   " + printFibRec(4));
		int n=50;
		for(int i = n; i > 1; i--)
		{
			System.out.print(printFibRec(i) +" ");
		}
		System.out.print("0");
	}// end of method
	
	public static int printFibRec(int n)
	{
		if(n<1) {
			System.out.println("Please enter a positive number");
			return Integer.MIN_VALUE;
		}
		else if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			return printFibRec(n-1) + printFibRec(n-2);
		}
	}

}// end of class
