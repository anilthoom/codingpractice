package com.anilt.ds.divideAndConquer;

import java.time.Duration;
import java.time.Instant;

public class House_Thieft_DC {

	public int maxMoney(int[] HouseNetWorth) {
		return maxMoneyRecursive(HouseNetWorth, 0);
	}//end of method

	private int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
		if (currentIndex >= HouseNetWorth.length) 
			return 0;

		int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex + 2);
		int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex + 1);

		return Math.max(stealCurrentHouse, skipCurrentHouse);
	}//end of method
	
	public int House_Thieft_DC_DP_BottomUp(int[] HouseNetWorth)
	{
		int dp[] = new int[HouseNetWorth.length+2];
		dp[HouseNetWorth.length] = 0;
		for(int i = HouseNetWorth.length-1; i>=0; i--)
		{
			dp[i] = Math.max(HouseNetWorth[i]+dp[i+2], dp[i+1]);
		}
		printArr(dp);
		return dp[0];
	}
	public void printArr(int[] arr)
	{
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}

	public static void main(String[] args) {
		House_Thieft_DC ht = new House_Thieft_DC();
		int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4, 1, 1, 2, 4, 70};
//		Instant startTime, endTime;
		
//		startTime = Instant.now();
		long startTime1 = System.nanoTime();
		System.out.println(ht.maxMoney(HouseNetWorth));
		long endTime1 = System.nanoTime();
		System.out.println(endTime1-startTime1);
//		HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
//		System.out.println(ht.maxMoney(HouseNetWorth));
//		endTime = Instant.now();
//		long timeTaken = Duration.between(startTime, endTime).toMillis();
//		System.out.println("Time Taken : "+ timeTaken);
		long startTime2 = System.nanoTime();
		int result = ht.House_Thieft_DC_DP_BottomUp(HouseNetWorth);
		long endTime2 = System.nanoTime();
		System.out.println("\n "+ (endTime2-startTime2));
//		
		
//		System.out.println(result);
	}
}// end of class