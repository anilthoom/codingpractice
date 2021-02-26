package com.anilt.problems.general;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
	//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    static int jumpingOnClouds(int[] c) 
    {
    	int noOfSteps = 0;
    	for (int i=0; i<c.length; ) 
    	{
			if((i+2 <c.length) && c[i+2] == 0)
			{
				noOfSteps++;
				i = i+2;
			}
			else if(i+1 < c.length)
			{
				noOfSteps++;
				i = i+1;
			}
			else
			{
				break;
			}
		}

    	return noOfSteps;
    }

    
    public static void main(String[] args) throws IOException
    { 
    	int c[] = {0, 0, 0, 0, 1, 0};
    
        int result = jumpingOnClouds(c);
        System.out.println(result);

    }
}
