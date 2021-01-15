package com.anilt.problems.greedy;

//https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
public class LuckBalance
{

	public static void main(String[] args)
	{
		int arr[][]= { {5,1},{2, 1}, {1,1}, {8,1}, {10,0}, {5,0} };
		System.out.println(luckBalance(3, arr));
	}
	static int luckBalance(int k, int[][] contests) 
	{
		int luckBalance = 0;
		int length = contests.length;
		for(int i =0; i<length; i++)
		{
			if(contests[i][0] <= contests[i][1])
				luckBalance = luckBalance - contests[i][0];
			else 
				luckBalance = luckBalance + contests[i][0];
		}
		return luckBalance;
    }

}
