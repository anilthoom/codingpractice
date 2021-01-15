package com.anilt.problems;


public class Fibonacii {

    public static void main(String[] args)
    {
        int counter = 15;
        System.out.print(n1+" "+n2+" ");
        printFib(counter);
        System.out.println("\n"+fib(counter));
    }
    static int n1=0;
    static int n2=1;
    static int n3 = 0;
    public static void printFib(int count)
    {
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
        if(count > 0)
        {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
            printFib(count-1);
        }
    }
    public static int fib(int n)
    {
        if(n < 1)
        {
            System.out.println("Enter valid number");
            return -1;
        }
        else if (n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
